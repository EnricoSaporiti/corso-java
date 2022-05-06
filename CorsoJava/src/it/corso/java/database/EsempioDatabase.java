package it.corso.java.database;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class EsempioDatabase {
	private Connection con;

	public static void main(String[] args) {

		EsempioDatabase d = new EsempioDatabase();
		
		
		try {
			System.out.println(d.getConnection().isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @return
	 * @throws SQLException 
	 */
	private Connection getConnection() throws SQLException {
		if(con == null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			
			dataSource.setDatabaseName("corso_java");
			dataSource.setPortNumber(3306);
			dataSource.setServerName("127.0.0.1");
			dataSource.setUser("root");
			dataSource.setPassword("root");
			
			con = dataSource.getConnection();

		}
		
		return con;
	}

}
