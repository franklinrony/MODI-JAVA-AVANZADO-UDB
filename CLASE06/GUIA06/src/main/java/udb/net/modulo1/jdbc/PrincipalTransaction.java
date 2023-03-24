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
 	//es.insertar(new Estudiante(4,"Eduardo","Lobos",8.50,77.90));
 	es.insertarVarios(new Estudiante(13,"Marcela","Lirios",8.50,77.90),new Estudiante(14,"Liliana","Recinos",8.50,77.90));
 	System.out.println("Registros insertados con exito");
	}

}
