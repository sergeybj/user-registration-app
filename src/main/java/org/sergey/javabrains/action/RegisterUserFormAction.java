package org.sergey.javabrains.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.sergey.javabrains.domain.User;
import org.sergey.javabrains.service.UserService;
import org.sergey.javabrains.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;

@Controller
@ResultPath(value = "/")
@ParentPackage(value="tiles-default")

@Validation
public class RegisterUserFormAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	UserService userService;

	private Long savedId;
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String birthDate;
	
	@RequiredFieldValidator(message="You must provide first name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@SkipValidation
	@Action(value = "/actions/registerUserForm", results = { @Result(name = "SUCCESS", type="tiles", location = "userReg")})
	public String registerUserForm() {
		return "SUCCESS";
	}

	@Action(value = "/actions/registerUserAction", results = {
			@Result(name = "SUCCESS", type="tiles", location = "successReg"),
			@Result(name = "input", type="tiles", location = "userReg")})
	public String register() {
		
		System.out.println("firstName = " + firstName);
		System.out.println("firstName.length() = " + firstName.length());
		

		/*Map<String, Object> map = ActionContext.getContext().getParameters();

		User user = new User();
		user.setFirstName(Utilities.getParamValue("firstName", map));
		user.setLastName(Utilities.getParamValue("lastName", map));
		user.setEmail(Utilities.getParamValue("email", map));
		user.setPassword(Utilities.getParamValue("password", map));
		DateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		try {
			user.setBirthDate(sdf.parse(Utilities.getParamValue("birthDate",
					map)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		savedId = userService.save(user);
		System.out.println("savedId = " + savedId);
		*/
		return "SUCCESS";
	}
	
	


	public Long getSavedId() {
		return savedId;
	}

	public void setSavedId(Long savedId) {
		this.savedId = savedId;
	}

}
