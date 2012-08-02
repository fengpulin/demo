package com.lfp.struts.action;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction extends ActionSupport implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;

	public String show() {
		return SUCCESS;
	}
}
