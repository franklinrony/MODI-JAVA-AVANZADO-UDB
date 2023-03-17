package udb.modulo1.spring.service;

import org.springframework.stereotype.Component;

import udb.modulo1.spring.model.FacturaConIva;
import udb.modulo1.spring.model.FacturaSinIva;

@Component
public class Servicio {
	public FacturaSinIva getFacturaSinIva() {
		FacturaSinIva f1 = new FacturaSinIva();
		f1.setNumero(1);
		f1.setConcepto("Computador");
		f1.setImporte(1240.20);
		return f1;
	}
	
	public FacturaConIva getFacturaConIva() {
		FacturaConIva f2 = new FacturaConIva();
		f2.setNumero(2);
		f2.setConcepto("Mueble Delux");
		f2.setImporte(240.20);
		return f2;
	}
}
