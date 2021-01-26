package com.exames.actions;

import com.exames.dao.DAO;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id_ex;

	private DAO dao = new DAO();

	public String execute() {

		dao.deleteExame(id_ex);

		return "DELETE";

	}

	public String getId_ex() {
		return id_ex;
	}

	public void setId_ex(String id_ex) {
		this.id_ex = id_ex;
	}

}
