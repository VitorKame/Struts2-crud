package com.exames.actions;

import com.exames.controller.Controller;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id_ex;

	private Controller controle = new Controller();
	private String retorno;

	public String execute() {

		retorno = controle.deleteExame(id_ex);

		return "DELETE";

	}

	public String getId_ex() {
		return id_ex;
	}

	public void setId_ex(String id_ex) {
		this.id_ex = id_ex;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}
}
