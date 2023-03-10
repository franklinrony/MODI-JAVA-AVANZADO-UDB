package udb.net.mod1.regacad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	ApplicationContext cont=new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
	
		Estudiante e1=cont.getBean(EstudianteCep.class);
		Estudiante e2=cont.getBean(EstudianteColP.class);
		/*e1.setNombre("Jose");
		e1.setApellido("Perez");
		e1.setCum(8.21);
		e1.setCuotaMensual(65.00);*/
		//eSTUDIANTE COLEGIO PRIVADO
		/*e2.setNombre("Mario");
		e2.setApellido("Martinez");
		e2.setCum(9.21);
		e2.setCuotaMensual(65.00);*/
		//imprimir datos
		imprimir(e1);
		imprimir(e2);
	}
	
	public static void imprimir(Estudiante e) {
		System.out.println(String.format("Nombre: %s %s\nCUM: %.2f\nCuota: %.2f",
				e.getNombre(),e.getApellido(),e.getCum(),(e.getCuotaMensual()-e.calcularMontoBeca())));
		System.out.println("***********************************************");
	}

}
