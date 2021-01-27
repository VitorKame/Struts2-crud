package com.exames.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.exames.dao.DAO;
import com.exames.model.ExmBean;

public class Controller {

	
	public String createExame(String nm_pac, String nm_ex, String dt_ex, String obs_ex) {
		
		String sql = "INSERT INTO exames (nm_pac, nm_ex, dt_ex, obs_ex) VALUES (?, ?, ?, ?)";
		
		DAO dao = new DAO();
		ExmBean exame = new ExmBean(nm_pac, nm_ex, dt_ex, obs_ex);
		
		try {
			Connection con = dao.getConnection();

			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, exame.getNm_pac());
			pst.setString(2, exame.getNm_ex());
			pst.setString(3, exame.getDt_ex());
			pst.setString(4, exame.getObs_ex());

			pst.executeUpdate();

			con.close();

			return "Sucesso";
		} catch (Exception e) {
			System.err.println("ERROR: " + e);
			return "Falha";
		}
	}

	public List<ExmBean> readExames() {
		List<ExmBean> list = new ArrayList<>();
		String sql = "SELECT * FROM exames ORDER BY nm_pac asc, nm_ex asc, nm_ex asc";
		DAO dao = new DAO();
		
		try {
			Connection con = dao.getConnection();

			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id_ex = rs.getString("id_ex");
				String nm_pac = rs.getString("nm_pac");
				String nm_ex = rs.getString("nm_ex");
				String dt_ex = rs.getString("dt_ex");
				String obs_ex = rs.getString("obs_ex");

				dt_ex = formatarData(dt_ex);

				list.add(new ExmBean(id_ex, nm_pac, nm_ex, dt_ex, obs_ex));
			}

			con.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e);
		}
		return list;
	}

	public String deleteExame(String id_ex) {
		
		String sql = "DELETE FROM exames WHERE id_ex=?";
		DAO dao = new DAO();
		
		try {
			Connection con = dao.getConnection();

			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, id_ex);

			pst.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e);
		}

		return "DELETE";
	}

	public String updateExame(String id_ex, String nm_pac, String nm_ex, String dt_ex, String obs_ex) {
		String sql = "UPDATE exames SET nm_pac = ?, nm_ex=?, dt_ex= ?, obs_ex = ? where id_ex = ?";
		DAO dao = new DAO();
		ExmBean exame = new ExmBean(id_ex, nm_pac, nm_ex, dt_ex, obs_ex);
		try {
			Connection con = dao.getConnection();

			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, exame.getNm_pac());
			pst.setString(2, exame.getNm_ex());
			pst.setString(3, exame.getDt_ex());
			pst.setString(4, exame.getObs_ex());
			pst.setString(5, exame.getId_ex());

			pst.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e);
		}

		return "UPDATE";
	}

	public ExmBean readExame(String id_ex) {
		String sql = "SELECT id_ex, nm_pac, nm_ex, dt_ex, obs_ex FROM exames WHERE id_ex =?";
		DAO dao = new DAO();
		
		ExmBean exame = new ExmBean();
		exame.setId_ex(id_ex);
		
		try {
			Connection con = dao.getConnection();

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id_ex);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String nm_pac = rs.getString("nm_pac");
				String nm_ex = rs.getString("nm_ex");
				String dt_ex = rs.getString("dt_ex");
				String obs_ex = rs.getString("obs_ex");
				exame = new ExmBean(id_ex, nm_pac, nm_ex, dt_ex, obs_ex);
			}
			con.close();

		} catch (Exception e) {
			System.err.println("ERROR: " + e);
		}

		return exame;

	}

	private String formatarData(String data) {

		String ano = data.split("-")[0];
		String mes = data.split("-")[1];
		String dia = data.split("-")[2];

		data = dia + '/' + mes + '/' + ano;

		return data;
	}
	
}
