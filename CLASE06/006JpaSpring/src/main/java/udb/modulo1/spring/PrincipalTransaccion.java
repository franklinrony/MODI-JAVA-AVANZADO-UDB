package udb.modulo1.spring;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import udb.modulo1.spring.model.Factura;
import udb.modulo1.spring.servicio.Servicio;

public class PrincipalTransaccion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub	

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		Servicio fs = contexto.getBean(Servicio.class);
		List<Factura> lst=fs.buscarFacturas();
		for (Factura factura : lst) {
			System.out.println(factura.getConcepto());
			System.out.println(factura.getImporte());
			System.out.println("********************");
		}
	}

}
