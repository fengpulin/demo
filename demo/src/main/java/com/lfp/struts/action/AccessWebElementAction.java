package com.lfp.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AccessWebElementAction extends ActionSupport implements
		RequestAware, SessionAware, ApplicationAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3043562621157338710L;

	private Map<String, Object> request;

	private Map<String, Object> session;

	private Map<String, Object> application;

	public String execute() {
		request.put("request1", "request1:request1");
		session.put("session1", "session1:session1");
		application.put("application1", "application1:application1");
		return SUCCESS;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

}