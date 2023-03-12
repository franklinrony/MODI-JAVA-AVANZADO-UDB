package udb.modulo1.sesion3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;





public class Principal {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Configurador.class);
	//Factura factura=context.getBean(FacturaSinIva.class);
	Servicio servicio=context.getBean(Servicio.class);
	//System.out.println(factura);
	servicio.mensaje();
	}

}		
