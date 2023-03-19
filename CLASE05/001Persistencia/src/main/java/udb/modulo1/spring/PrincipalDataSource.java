package udb.modulo1.spring;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import udb.modulo1.spring.model.Factura;
import udb.modulo1.spring.servicio.Servicio;

public class PrincipalDataSource {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub	

		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
			Servicio servicio = context.getBean(Servicio.class);	
			servicio.insertarFactura(servicio.getFactura());
			System.out.println("Facturas registradas ...");
			for( Factura f: servicio.buscarFacturas()) {
				System.out.println(f.getNumero());
				System.out.println(f.getConcepto());
				System.out.println(f.getImporte());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
