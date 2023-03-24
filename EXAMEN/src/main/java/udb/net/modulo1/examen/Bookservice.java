package udb.net.modulo1.examen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Bookservice {
	@Autowired
	BookRepositoryPlantilla repositorio;
	
	public Bookservice() {
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	public void insertarVarios(Book book1,Book book2) {
		repositorio.insertar(book1);
		repositorio.insertar(book2);
	}
	
	public List<Book> findAll(){
		return repositorio.buscarTodos();
	}

}
