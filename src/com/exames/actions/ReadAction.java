package com.exames.actions;

import java.util.ArrayList;
import java.util.List;

import com.exames.controller.Controller;
import com.exames.model.ExmBean;

import com.opensymphony.xwork2.ActionSupport;

public class ReadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean retorno;
	
	private Controller controle = new Controller();
	
	List<ExmBean> listaExames = new ArrayList<ExmBean>();

	public String execute() throws Exception {
		
		listaExames = controle.readExames();
		
		return "READ";
	}

	public List<ExmBean> getListaExames() {
		return listaExames;
	}

	public void setListaExames(List<ExmBean> listaExames) {
		this.listaExames = listaExames;
	}

	public boolean getRetorno() {
		return retorno;
	}

	public void setRetorno(boolean retorno) {
		this.retorno = retorno;
	}
	
	

}
