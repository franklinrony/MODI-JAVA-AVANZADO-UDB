package udb.net.mod1.poa.metricas;

import org.springframework.stereotype.Component;



@Component
public class Servicio {
	
	public void metodo1() {
		try {
			Thread.currentThread().sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Metodo 1.");
	}
	
	public void metodo2() {
		System.out.println("Metodo 2.");
	}
}
