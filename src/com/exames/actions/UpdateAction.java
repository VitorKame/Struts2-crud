package com.exames.actions;

import com.opensymphony.xwork2.ActionSupport;

import com.exames.dao.DAO;
import com.exames.model.ExmBean;

public class UpdateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id_ex;
	private String nm_pac;
	private String nm_ex;
	private String dt_ex;
	private String obs_ex;

	private DAO dao = new DAO();
	private ExmBean exame = new ExmBean();
	private ExmBean attExame = new ExmBean();

	public String execute() {

		if (nm_pac == null || nm_ex == null || dt_ex == null || obs_ex == null) {
			exame = dao.readExame(id_ex);
			return "UPDATE";
		} else {
			attExame.setId_ex(id_ex);
			attExame.setNm_pac(nm_pac);
			attExame.setNm_ex(nm_ex);
			attExame.setDt_ex(dt_ex);
			attExame.setObs_ex(obs_ex);

			dao.updateExame(attExame);
			return "READ";
		}
	}

	public String getId_ex() {
		return id_ex;
	}

	public void setId_ex(String id_ex) {
		this.id_ex = id_ex;
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

	public ExmBean getExame() {
		return exame;
	}

	public void setExame(ExmBean exame) {
		this.exame = exame;
	}

}
