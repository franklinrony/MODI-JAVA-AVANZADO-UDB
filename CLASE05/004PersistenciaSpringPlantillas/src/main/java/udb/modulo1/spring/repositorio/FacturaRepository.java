package udb.modulo1.spring.repositorio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import udb.modulo1.spring.FacturaRowMapper;
import udb.modulo1.spring.model.Factura;
@Component
public class FacturaRepository {
	@Autowired
	private JdbcTemplate plantilla;
	
	public Factura getFactura() {
		Factura f1 = new Factura();
		f1.setNumero(5);
		f1.setConcepto("Silla");
		f1.setImporte(120.20);
		return f1;
	}
	
	public void insertar(Factura factura) throws SQLException, ClassNotFoundException {
		String sql = "insert into factura (numero,concepto,importe) value (?,?,?)";
		plantilla.update(sql, factura.getNumero(), factura.getConcepto(),factura.getImporte());
	}
	
	
	public List<Factura> listarFacturas() throws SQLException{
		String sql = "select * from factura";
		List<Factura> lista= new ArrayList<Factura>();
		return plantilla.query(sql, new FacturaRowMapper());
	}
	
	
	public List<Factura> listarFacturaSinFacturaRowMapper() throws SQLException{
		String sql = "select * from factura";
		List<Factura> lista= new ArrayList<Factura>();
		return plantilla.query(sql, new BeanPropertyRowMapper<Factura>(Factura.class));
	}
	
	public void actualizar(Factura f) {
		String sql = "update factura set concepto=?, importe=? where numero=?";
		plantilla.update(sql,f.getConcepto(),f.getImporte(),f.getNumero());
	}
	
	public void borrar(Factura f) {
		String sql = "delete from factura where numero=?";
		plantilla.update(sql,f.getNumero());
	}
	
}
