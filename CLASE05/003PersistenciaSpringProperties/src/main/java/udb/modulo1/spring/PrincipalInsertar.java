package udb.modulo1.spring;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import udb.modulo1.spring.model.Factura;
import udb.modulo1.spring.servicio.Servicio;

public class PrincipalInsertar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub	

		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
			Servicio servicio = context.getBean(Servicio.class);	
			servicio.insertarFactura(servicio.getFactura());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
