package udb.modulo1.spring;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

//Singleton
// clase que solo tiene un objeto en memoria
public class MiDataSource {
	
	private static MiDataSource miDataSource;
	private MysqlDataSource mySQLDataSource;
	private MiDataSource() {
		mySQLDataSource = new MysqlDataSource();
		mySQLDataSource.setUrl("jdbc:mysql://localhost/spring?serverTimezone=UTC");
		mySQLDataSource.setUser("root");
		mySQLDataSource.setPassword("");
	}
	
	// metodo publico
	// se generara un objeto y queda en memoria
	public static MiDataSource getInstance() {
		if(miDataSource == null) {
			miDataSource = new MiDataSource();
		}
		return miDataSource;
	}
	
	public Connection getConnection() throws SQLException{
		return mySQLDataSource.getConnection();
	}
}
