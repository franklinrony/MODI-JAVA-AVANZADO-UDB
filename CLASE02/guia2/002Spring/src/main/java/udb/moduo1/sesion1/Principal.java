package udb.moduo1.sesion1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
	ApplicationContext cont=new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
	Factura f1=cont.getBean(FacturaConIva.class);
		

	}

}		
