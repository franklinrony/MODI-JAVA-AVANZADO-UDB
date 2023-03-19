package udb.net.modulo1.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalSpringDespliegue {

	public PrincipalSpringDespliegue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(ConfigurandoSpring.class);
		EstudianteRepositoryPlantilla er=contexto.getBean(EstudianteRepositoryPlantilla.class);
		Estudiante es=new Estudiante(3,"Maria","Serrano",8.50,77.90);
		List<Estudiante> lst=new ArrayList<Estudiante>();
		
		lst=er.buscarTodos();
		for(Estudiante est:lst) {
			System.out.println("Codigo: "+est.getCodigo());
			System.out.println("Nombre: "+est.getNombre());
			System.out.println("CUM: "+est.getCum());
			System.out.println("Cuota: "+est.getCuotaMensual());
			System.out.println("*************************************");
			
		}
	}
}
