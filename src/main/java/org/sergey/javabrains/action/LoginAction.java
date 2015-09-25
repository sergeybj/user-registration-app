package org.sergey.javabrains.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.stereotype.Controller;

@Controller
@ResultPath(value = "/")
@ParentPackage(value="tiles-default")
public class LoginAction {
	
	@Action(value = "/actions/loginForm", results = { @Result(name = "SUCCESS", type="tiles", location = "userLogin") })
	public String loginForm(){
		return "SUCCESS";
	}
	
	@Action(value="/actions/loginAction")
	public String loginAction(){
		return "SUCCESS";
	}


}
