package it.corso.java.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class EsempioDatabase {
	private Connection con;

	public static void main(String[] args) {

		EsempioDatabase d = new EsempioDatabase();

		try {
			System.out.println(d.getConnection().isClosed());
			d.esempioInsert("Enrico", "Saporiti", "enrico.sapotiti@libero.it", "3371048969");
			d.esempioSelect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void esempioInsert(String nome, String cognome, String email, String telefono) throws SQLException {
		String sql = "INSERT INTO clienti(nome, cognome, email, telefono) " + "VALUES(  ?  ,  ? ,  ?  ,  ? )";

		System.out.println("sql       = " + sql);

		PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		ps.setString(1, nome);
		ps.setString(2, cognome);
		ps.setString(3, email);
		ps.setString(4, telefono);

		ps.executeUpdate();

		ResultSet rs = ps.getGeneratedKeys();
		rs.next();

		System.out.println("id       = " + rs.getInt(1));

	}

	private void esempioSelect() throws SQLException {
		String sql = "SELECT id, nome, cognome , email, telefono FROM clienti";

		PreparedStatement ps = getConnection().prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println("id       = " + rs.getInt(1));
			System.out.println("nome     = " + rs.getString(2));
			System.out.println("cognome  = " + rs.getString(3));
			System.out.println("emal     = " + rs.getString(4));
			System.out.println("telefono = " + rs.getString(5));
			System.out.println("----------------------------");

		}
	}

	/**
	 * @return
	 * @throws SQLException
	 */
	private Connection getConnection() throws SQLException {
		if (con == null) {
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
