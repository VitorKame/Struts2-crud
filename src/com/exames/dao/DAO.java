package com.exames.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

	private String driver = "com.mysql.jdbc.Driver";

	private String url = "jdbc:mysql://127.0.0.1:3306/dbexames?useTimezone=true&serverTimezone=UTC";

	private String user = "root";
	private String password = "Db@147";

	public Connection getConnection() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.err.println("ERROR: " + e);
			return null;
		}
	}

}
