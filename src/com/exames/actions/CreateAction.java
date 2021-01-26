package com.exames.actions;

import com.exames.dao.DAO;
import com.exames.model.ExmBean;
import com.opensymphony.xwork2.ActionSupport;

public class CreateAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String nm_pac;
	private String nm_ex;
	private String dt_ex;
	private String obs_ex;

	private String retorno, sucesso = "Sucesso";

	DAO dao = new DAO();
	ExmBean exame = new ExmBean();

	public String execute() {

		exame.setNm_pac(nm_pac);
		exame.setNm_ex(nm_ex);
		exame.setDt_ex(dt_ex);
		exame.setObs_ex(obs_ex);

		retorno = dao.createExame(exame);

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

	public String getSucesso() {
		return sucesso;
	}

	public void setSucesso(String sucesso) {
		this.sucesso = sucesso;
	}

}
