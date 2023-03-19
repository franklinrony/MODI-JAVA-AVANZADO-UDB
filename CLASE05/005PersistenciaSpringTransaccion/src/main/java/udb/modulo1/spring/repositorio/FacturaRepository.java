package udb.modulo1.spring.repositorio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import udb.modulo1.spring.FacturaRowMapper;
import udb.modulo1.spring.model.Factura;
@Repository
public class FacturaRepository {
	@Autowired
	private JdbcTemplate plantilla;
	
	public Factura getFactura() {
		Factura f1 = new Factura();
		f1.setNumero(4);
		f1.setConcepto("Silla");
		f1.setImporte(120.20);
		return f1;
	}
	
	@Transactional
	public void insertar(Factura factura) 
	{
		String sql = "insert into Factura (numero,concepto,importe) values (?,?,?)";
		plantilla.update(sql,factura.getNumero(),factura.getConcepto(),factura.getImporte());
	}
	
	public List<Factura> listarFacturas() {
		String sql = "select * from factura";
		List<Factura> lista= new ArrayList<Factura>();
		return plantilla.query(sql, new FacturaRowMapper());
	}
	
	
	public List<Factura> listarFacturaSinFacturaRowMapper() {
		String sql = "select * from factura";
		List<Factura> lista= new ArrayList<Factura>();
		return plantilla.query(sql, new BeanPropertyRowMapper<Factura>(Factura.class));
	}
	
	@Transactional
	public void actualizar(Factura f) {
		String sql = "update factura set concepto=?, importe=? where numero=?";
		plantilla.update(sql,f.getConcepto(),f.getImporte(),f.getNumero());
	}
	
	@Transactional
	public void borrar(Factura f) {
		String sql = "delete from factura where numero=?";
		plantilla.update(sql,f.getNumero());
	}
	
}
