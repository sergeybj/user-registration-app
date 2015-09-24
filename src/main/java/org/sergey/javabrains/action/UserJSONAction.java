package org.sergey.javabrains.action;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.sergey.javabrains.domain.User;
import org.sergey.javabrains.dto.UserDTO;
import org.sergey.javabrains.service.UserService;
import org.sergey.javabrains.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;

@SuppressWarnings("deprecation")
@Controller
@ResultPath(value = "/")
@ParentPackage(value = "struts-default")
public class UserJSONAction {

	private InputStream inputStream;

	public InputStream getInputStream() {
		return inputStream;
	}

	@Autowired
	UserService userService;

	@Action(value = "/actions/userByIdAction", results = { @Result(type = "stream", name = "SUCCESS", params = {
			"contentType", "text/plain", "inputName", "inputStream", }) })
	public String userByIdJson() {

		System.out.println("userByIdJson()");
		Gson gson = new Gson();
		Map<String, Object> map = ActionContext.getContext().getParameters();
		Long id = Long.parseLong(Utilities.getParamValue("userId", map));
		User user = userService.getUserById(id);
		UserDTO udto = new UserDTO();
		udto = udto.copy(user);
		String result = gson.toJson(udto);
		inputStream = new StringBufferInputStream(result);
		return "SUCCESS";
	}

}
