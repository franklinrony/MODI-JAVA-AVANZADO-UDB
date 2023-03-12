package udb.net.mod1.regacad;

public class EstudianteProxy extends Estudiante {
private Estudiante estudiante;
	public EstudianteProxy() {
		// TODO Auto-generated constructor stub
	}
public EstudianteProxy(Estudiante estudiante) {
	super();
	this.estudiante=estudiante;
}
	public EstudianteProxy(Integer codigo, String nombre, String apellido, Double cum, Double cuotaMensual) {
		super(codigo, nombre, apellido, cum, cuotaMensual);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMontoBeca() {
		// TODO Auto-generated method stub
		System.out.println("Estudiante con mayor beca");
		return estudiante.calcularMontoBeca();
	}

}
