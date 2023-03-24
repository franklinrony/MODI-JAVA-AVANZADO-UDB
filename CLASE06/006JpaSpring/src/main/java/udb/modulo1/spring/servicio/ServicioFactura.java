package udb.modulo1.spring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import udb.modulo1.spring.model.Factura;
import udb.modulo1.spring.repositorio.FacturaRepository;

@Service
public class ServicioFactura {
	@Autowired
	private FacturaRepository facturaRepository;

	public void insertar(Factura factura) {
		facturaRepository.insertar(factura);
	}

	public List<Factura> listarFacturas() {
		return facturaRepository.listarFacturas();
	}

	public void actualizar(Factura f) {
		facturaRepository.actualizar(f);
	}

	public void borrar(Factura f) {
		facturaRepository.borrar(f);
	}
	
	
	
}
