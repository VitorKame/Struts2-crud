package com.exames.actions;

import java.util.ArrayList;
import java.util.List;

import com.exames.dao.DAO;
import com.exames.model.ExmBean;

import com.opensymphony.xwork2.ActionSupport;

public class ReadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DAO dao = new DAO();
	List<ExmBean> listaExames = new ArrayList<ExmBean>();

	public String execute() throws Exception {

		listaExames = dao.readExames();

		return "READ";
	}

	public List<ExmBean> getListaExames() {
		return listaExames;
	}

	public void setListaExames(List<ExmBean> listaExames) {
		this.listaExames = listaExames;
	}

}
