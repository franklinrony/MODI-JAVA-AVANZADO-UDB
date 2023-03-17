package udb.net.mod1.poa.metricas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);
		Servicio servicio = context.getBean(Servicio.class);	
		//servicio.mensaje();
		servicio.metodo1();
		servicio.metodo2();
	
	}

}
