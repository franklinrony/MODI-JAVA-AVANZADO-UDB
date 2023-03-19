package udb.modulo1.spring.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import udb.modulo1.spring.MiDataSource;
import udb.modulo1.spring.model.Factura;
@Component
public class FacturaRepository {
	public Factura getFactura() {
		Factura f1 = new Factura();
		f1.setNumero(2);
		f1.setConcepto("Computador");
		f1.setImporte(1260.20);
		return f1;
	}
	
	public void insertar(Factura factura) throws SQLException, ClassNotFoundException {
		String sql = "insert into factura (numero,concepto,importe) value (?,?,?)";
		
		List<Factura> lista = new ArrayList<Factura>();
		try(Connection connection = getConexion();
				PreparedStatement sentencia = connection.prepareStatement(sql)){
			sentencia.setInt(1, factura.getNumero());
			sentencia.setString(2, factura.getConcepto());
			sentencia.setDouble(3, factura.getImporte());
			sentencia.execute();
		}catch (SQLException e) {
			throw e;
		}
	}
	
	public List<Factura> listarFacturas() throws SQLException{
		String sql = "select * from factura";
		List<Factura> lista= new ArrayList<Factura>();
		try(Connection connection = getConexion();
				PreparedStatement sentencia = connection.prepareStatement(sql);
				ResultSet rs = sentencia.executeQuery()){
			while (rs.next()) {
				Factura f = new Factura();
				f.setNumero(Integer.parseInt(rs.getString("numero")));
				f.setConcepto(rs.getString("concepto"));
				f.setImporte(Double.parseDouble(rs.getString("importe")));
				lista.add(f);
			}
		} catch(SQLException e) {
			throw e;
		}
		return lista;
	}
	
	private Connection getConexion() throws SQLException {
		// Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/spring?serverTimezone=UTC","root","");
		
		Connection conexion = MiDataSource.getInstance().getConnection();
		
		return conexion;
		 
	}
}
