package udb.modulo1.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import udb.modulo1.spring.service.Servicio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		Servicio servicio = context.getBean(Servicio.class);		
		System.out.println(servicio.getFacturaSinIva());
		System.out.println(servicio.getFacturaConIva());
	}

}
