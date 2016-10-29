package br.edu.devmedia.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConfig {
	
	private static DataBaseConfig config;
	
	public static DataBaseConfig getInstance(){
		if(config == null){
			config = new DataBaseConfig();
		}
		
		return config;
	}
	
	public Connection getConnetion() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/android_webapp?autoReconnect=true&useSSL=false", "root", "root");
	}
	
	
	public static void main(String[] args) throws SQLException {
		System.out.println(DataBaseConfig.getInstance().getConnetion());
	}

}
