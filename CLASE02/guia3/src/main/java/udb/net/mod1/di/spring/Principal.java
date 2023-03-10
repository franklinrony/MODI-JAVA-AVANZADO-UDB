package udb.net.mod1.di.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont=new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		Cliente cliente=cont.getBean(Cliente.class);
		
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getFactura().getMonto());		
		System.out.println("*********************");
		
		for(DetalleFactura d: cliente.getFactura().getDetalleFactura()) {
			System.out.println("Concepto "+d.getConcepto());
			System.out.println("Cantidad "+d.getCantidad());
			System.out.println("Precio unidad "+d.getMontoUnitario());
			System.out.println("**************************");
		}
		
	}

}
