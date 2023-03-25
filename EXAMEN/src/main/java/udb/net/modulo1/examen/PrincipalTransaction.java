package udb.net.modulo1.examen;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalTransaction {

	public PrincipalTransaction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(ConfigurandoSpring.class);
		Bookservice bs=contexto.getBean(Bookservice.class);
		bs.insertarVarios(new Book(6, "El Extranjero", "Albert Camus", "Dramaturgo", 20), 
				new Book(7, "Don Quijote", "Miguel de Cervantes", "Novela", 10));
		System.out.println("Registros insertados con exito");
		List<Book> lista=bs.findAll();
		
		for(Book book:lista) {
			System.out.println("Id : "+book.getIdBook());
			System.out.println("Titulo "+book.getTitle());
			System.out.println("..........................");
		}
	}

}
