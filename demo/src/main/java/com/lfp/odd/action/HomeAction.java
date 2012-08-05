package com.lfp.odd.action;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {
		return SUCCESS;
	}

}