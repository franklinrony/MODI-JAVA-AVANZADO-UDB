package udb.net.modulo1.examen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookRepository {
	@Autowired
	DataSource dataSource;

	public List<Book> buscarTodos() throws SQLException, ClassNotFoundException {
		String sql = "select * from book";
		List<Book> lista = new ArrayList<Book>();

		try (Connection connection = getConexion();
				PreparedStatement sentencia = connection.prepareStatement(sql);
				ResultSet rs = sentencia.executeQuery()) {
			while (rs.next()) {
				Book b = new Book();
				b.setIdBook(rs.getInt("idBook"));
				b.setTitle(rs.getString("Title"));
				b.setAuthor(rs.getString("Author"));
				b.setGenre(rs.getString("Genre"));
				b.setStock(rs.getInt("Stock"));
				lista.add(b);

			}

		}

		catch (SQLException e) {
			throw e;
		}
		return lista;
	}

	public void insertar(Book book) throws SQLException {
		String sql = "insert into book(idBook, Title,Author, Genre,Stock) values(?,?,?,?,?)";
		try (Connection connection = getConexion(); PreparedStatement sentencia = connection.prepareStatement(sql)) {
			sentencia.setInt(1, book.getIdBook());
			sentencia.setString(2,book.getTitle());
			sentencia.setString(3, book.getAuthor());
			sentencia.setString(4, book.getGenre());
			sentencia.setInt(5, book.getStock());
			sentencia.execute();
		} catch (SQLException e) {
			throw e;
		}

	}

	private Connection getConexion() throws SQLException {
		Connection conexion = dataSource.getConnection();
		return conexion;
	}
}
