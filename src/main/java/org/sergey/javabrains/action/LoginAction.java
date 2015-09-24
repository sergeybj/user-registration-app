package org.sergey.javabrains.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

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
