package com.exames.model;

public class ExmBean {

	private String id_ex;
	private String nm_pac;
	private String nm_ex;
	private String dt_ex;
	private String obs_ex;

	public ExmBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExmBean(String id_ex, String nm_pac, String nm_ex, String dt_ex, String obs_ex) {
		super();
		this.id_ex = id_ex;
		this.nm_pac = nm_pac;
		this.nm_ex = nm_ex;
		this.dt_ex = dt_ex;
		this.obs_ex = obs_ex;
	}

	public ExmBean(String nm_pac, String nm_ex, String dt_ex, String obs_ex) {
		super();
		this.nm_pac = nm_pac;
		this.nm_ex = nm_ex;
		this.dt_ex = dt_ex;
		this.obs_ex = obs_ex;
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

}
