package com.exames.actions;

import com.exames.controller.Controller;
import com.opensymphony.xwork2.ActionSupport;

public class CreateAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String nm_pac;
	private String nm_ex;
	private String dt_ex;
	private String obs_ex;
	private String retorno;

	Controller controle = new Controller();

	public String execute() {

		retorno = controle.createExame(nm_pac, nm_ex, dt_ex, obs_ex);

		return "CREATE";
	}

	public String getNm_pac() {
		return nm_pac;
	}

	public void setNm_pac(String nm_pac) {
		this.nm_pac = nm_pac;
	}

	public String getNm_ex() {
		return nm_ex;
	}

	public void setNm_ex(String nm_ex) {
		this.nm_ex = nm_ex;
	}

	public String getDt_ex() {
		return dt_ex;
	}

	public void setDt_ex(String dt_ex) {
		this.dt_ex = dt_ex;
	}

	public String getObs_ex() {
		return obs_ex;
	}

	public void setObs_ex(String obs_ex) {
		this.obs_ex = obs_ex;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

}
