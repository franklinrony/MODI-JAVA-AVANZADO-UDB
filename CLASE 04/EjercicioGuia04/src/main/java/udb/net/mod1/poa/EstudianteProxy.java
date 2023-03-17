package udb.net.mod1.poa;

public class EstudianteProxy extends Estudiante {
	private Estudiante estudiante;
	
	public EstudianteProxy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstudianteProxy(Integer codigo, String nombre, String apellido, Double cum, Double cuotaMensual) {
		super(codigo, nombre, apellido, cum, cuotaMensual);
		// TODO Auto-generated constructor stub
	}

	public  EstudianteProxy(Estudiante estudiante) {
		super();
		this.estudiante=estudiante;
	}
	
	@Override
	public Double calcularMontoBeca() {
		System.out.println("Estudiante con mayor monto en beca!!");
		return estudiante.calcularMontoBeca();
	}

	public Integer getCodigo() {
		return estudiante.getCodigo();
	}

	public void setCodigo(Integer codigo) {
		estudiante.setCodigo(codigo);
	}

	public String getNombre() {
		return estudiante.getNombre();
	}

	public void setNombre(String nombre) {
		estudiante.setNombre(nombre);
	}

	public String getApellido() {
		return estudiante.getApellido();
	}

	public void setApellido(String apellido) {
		estudiante.setApellido(apellido);
	}

	public Double getCum() {
		return estudiante.getCum();
	}

	public void setCum(Double cum) {
		estudiante.setCum(cum);
	}

	public Double getCuotaMensual() {
		return estudiante.getCuotaMensual();
	}

	public void setCuotaMensual(Double cuotaMensual) {
		estudiante.setCuotaMensual(cuotaMensual);
	}

	public boolean equals(Object obj) {
		return estudiante.equals(obj);
	}

	
}
