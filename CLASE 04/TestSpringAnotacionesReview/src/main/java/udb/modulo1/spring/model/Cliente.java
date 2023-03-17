package udb.modulo1.spring.model;



public class Cliente {
	private String numDoc;
	private String nombre;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Cliente(String numDoc, String nombre) {
		super();
		this.numDoc = numDoc;
		this.nombre = nombre;
	}



	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [numDoc=" + numDoc + ", nombre=" + nombre + "]";
	}
	
	
}
