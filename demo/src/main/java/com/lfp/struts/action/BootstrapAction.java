package com.lfp.struts.action;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class BootstrapAction extends ActionSupport implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 4786825015586404106L;

	@Override
	public String execute() {
		return SUCCESS;
	}
}