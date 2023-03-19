package udb.modulo1.spring.servicio;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import udb.modulo1.spring.model.Factura;
import udb.modulo1.spring.repositorio.FacturaRepository;

@Component
public class Servicio {	
	
	@Autowired
	private FacturaRepository facturaRepository;	
			
	public Factura getFactura() {
		return facturaRepository.getFactura();
	}	
	
	public void insertarFactura(Factura factura) throws ClassNotFoundException, SQLException {
		facturaRepository.insertar(factura);
	}
	
	public List<Factura> buscarFacturas() throws SQLException{
		return facturaRepository.listarFacturas();
	}
	
}
