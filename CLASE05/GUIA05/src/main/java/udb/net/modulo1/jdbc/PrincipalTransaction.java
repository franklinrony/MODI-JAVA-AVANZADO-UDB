package udb.net.modulo1.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalTransaction {

	public PrincipalTransaction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(ConfigurandoSpring.class);
		EstudianteService es=contexto.getBean(EstudianteService.class);
		es.insertarVarios(new Estudiante(3,"Eduardo","Lobos",8.50,77.90),new Estudiante(12,"Karla","Lopez",8.50,77.90));
	}

}
