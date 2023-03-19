package udb.net.modulo1.jdbc;

import java.lang.annotation.Annotation;
import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(ConfigurandoSpring.class);
		//EstudianteRepository er=new EstudianteRepository();
		EstudianteRepository er=contexto.getBean(EstudianteRepository.class);
		Estudiante es=new Estudiante(1,"Carlos","Lemus",9.00,67.90);
		Estudiante es2=new Estudiante(2,"Rony","Cortez",9.50,99.00);
		
		try {
			er.insertar(es);
			er.insertar(es2);
			System.out.println("Insercion realizada con exito!");
		}

		catch(SQLException e) {
			e.printStackTrace();
		}
		/*catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
	}

}
