package udb.net.modulo1.examen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BookRepositoryPlantilla {
	@Autowired
	private JdbcTemplate plantilla;
	
	public BookRepositoryPlantilla() {	
		
	}
	
	public List<Book>buscarTodos(){
		String sql="Select idBook , Title, Author, Genre, Stock from book";
		return plantilla.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
	}

	public void insertar(Book book) {
		String sql="insert into book (idBook, Title, Author,Genre,Stock) values(?,?,?,?,?)";
		plantilla.update(sql,book.getIdBook(),book.getTitle(),book.getAuthor()
				,book.getGenre(),book.getStock());		
	}
	
	public void borrar(Book book) {
		String sql="delete from book where idBook=?";
		plantilla.update(sql,book.getIdBook());
	}
	
	public void actualizar(Book book) {
		String sql="update book set Title=?, Author=?, Genre=?, Stock=? where idBook=?";
		plantilla.update(sql, book.getTitle(),book.getAuthor(),
				book.getGenre(),book.getStock());
	}
}
