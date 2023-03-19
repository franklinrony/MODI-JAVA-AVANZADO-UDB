package udb.net.modulo1.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class MiDataSource {
	private static MiDataSource miDataSource=new MiDataSource();
	private MysqlDataSource mySQLDataSource;
	
	private MiDataSource() {
		mySQLDataSource=new MysqlDataSource();
		mySQLDataSource.setUrl("jdbc:mysql://localhost/spring?serverTimezone=UTC");
		mySQLDataSource.setUser("root");
		mySQLDataSource.setPassword("R0ny1986");
	}
	
	public static MiDataSource getInstance() {
		if(miDataSource==null) {
			miDataSource=new MiDataSource();
		}
		return miDataSource;
	}
	
	public Connection getConnection() throws SQLException{
		return mySQLDataSource.getConnection();
	}
}
