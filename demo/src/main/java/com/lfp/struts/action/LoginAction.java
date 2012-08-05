package com.lfp.struts.action;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.lfp.struts.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 8226821301386720405L;

	/**
	 * struts传参实例
	 */
	private String actionString;

	/**
	 * struts传参实例
	 */
	private User user1;

	private User user2;

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getActionString() {
		return actionString;
	}

	public void setActionString(String actionString) {
		this.actionString = actionString;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}
	
	public String login() {
		// 从前台取数据(自动注入的方式传入数据)
		String name = StringUtils.trim(user.getName());
		String password = StringUtils.trim(user.getPassword());
		// 往前台jsp页面传对象参数，通过request写入
		User u1 = new User();
		u1.setName("u1");
		u1.setPassword("p1");
		User u2 = new User();
		u2.setName("u2");
		u2.setPassword("p2");
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("u1", u1);
		request.setAttribute("u2", u2);
		// 给user1和user2赋值
		user1 = new User();
		user1.setName("user1");
		user1.setPassword("p1");
		user2 = new User();
		user2.setName("user2");
		user2.setPassword("p2");
		if ("aaa".equals(name) && "aaa".equals(password)) {
			// 往前台jsp页面传对象普通参数
			actionString = "这是返回成功时action中写入的值";
			return SUCCESS;
		}
		actionString = "这是返回error时action中写入的值";
		return ERROR;
	}
}