package udb.modulo1.spring;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import udb.modulo1.spring.model.Factura;
import udb.modulo1.spring.servicio.Servicio;

public class PrincipalTransaccion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub	

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		Servicio fs = contexto.getBean(Servicio.class);
		fs.insertarVarios(new Factura(9,"silla gamer",690.90),new Factura(8,"ordenador",459.89));		
	
	}

}
