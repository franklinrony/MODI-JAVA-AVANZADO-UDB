package udb.modulo1.spring.servicio;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import udb.modulo1.spring.model.Factura;
import udb.modulo1.spring.repositorio.FacturaRepository;

@Service
public class Servicio {	
	
	@Autowired
	private FacturaRepository facturaRepository;
		
	@Transactional
	public void insertarVarios(Factura f1, Factura f2) {
		facturaRepository.insertar(f1);
		facturaRepository.insertar(f2);
	}
	
	public Factura getFactura(Integer id) {
		return facturaRepository.getFactura(id);
	}	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void insertarFactura(Factura factura) throws ClassNotFoundException, SQLException {
		facturaRepository.insertar(factura);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Factura> buscarFacturas() throws SQLException{
		return facturaRepository.listarFacturas();
	}
	
	@Transactional
	public void borrarFactura(Factura factura) {
		facturaRepository.borrar(factura);
	}
	
	@Transactional
	public void updateFactura(Factura factura) {
		facturaRepository.actualizar(factura);
	}
	
}
