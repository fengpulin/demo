package com.lfp.struts.action;

import org.apache.commons.lang3.StringUtils;

import com.lfp.struts.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String login(){
		//从前台取数据(自动注入的方式传入数据)
		String name = StringUtils.trim(user.getName());
		String password = StringUtils.trim(user.getPassword());

		if ("aaa".equals(name)&&"aaa".equals(password)) {
			return SUCCESS;
		}
		return ERROR;
	}
}