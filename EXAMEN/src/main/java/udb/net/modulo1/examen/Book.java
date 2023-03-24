package udb.net.modulo1.examen;

public class Book {
	private Integer idBook;
	private String title;
	private String author;
	private String genre;
	private Integer stock;
	
	
	
	public Book() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Book(Integer idBook, String title, String author, String genre, Integer stock) {
		super();
		this.idBook = idBook;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.stock = stock;
	}

	public Integer getIdBook() {
		return idBook;
	}
	
	public void setIdBook(Integer idBook) {
		this.idBook = idBook;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	

}
