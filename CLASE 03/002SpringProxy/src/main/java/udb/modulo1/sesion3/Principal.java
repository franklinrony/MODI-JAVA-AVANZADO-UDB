package udb.modulo1.sesion3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Principal {

	public static void main(String[] args) {
	/*ApplicationContext cont=new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
	Factura f1=cont.getBean(FacturaConIva.class);*/
		// TODO Auto-generated method stub
		FacturaConIva f1=new FacturaConIva(1, "COMPUTADOR", 1000.00);
		FacturaSinIva f2=new FacturaSinIva(2, "PS4", 1000.00);
		
		System.out.println("PRINCIPAL 1");	
		System.out.println("*********");
		System.out.println(f1.getImporte());
		System.out.println("*********");
		System.out.println(f2.getImporte());

	}

}		
