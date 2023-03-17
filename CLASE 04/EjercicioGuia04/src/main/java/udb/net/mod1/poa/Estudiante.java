package udb.net.mod1.poa;

public abstract class Estudiante {
	private Integer codigo;
	private String nombre;
	private String apellido;
	private Double cum;
	private Double cuotaMensual;
	
	public Estudiante() {
		
	}

	public Estudiante(Integer codigo, String nombre, String apellido, Double cum, Double cuotaMensual) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cum = cum;
		this.cuotaMensual = cuotaMensual;
	}

	public abstract Double calcularMontoBeca();
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getCum() {
		return cum;
	}

	public void setCum(Double cum) {
		this.cum = cum;
	}

	public Double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(Double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	
}
