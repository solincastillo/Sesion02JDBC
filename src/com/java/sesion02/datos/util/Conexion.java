package com.java.sesion02.datos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public Connection getConnection(){
		Connection conn  = null;
		
		try{
		String url = "jdbc:mysql://192.168.99.100:32750/dbMatricula";
		String usuario = "root";
		String password = "mysql";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url,usuario,password);
		
		}catch(ClassNotFoundException | SQLException ex){
			ex.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection conn = conexion.getConnection();
		try {
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
