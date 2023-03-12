package udb.net.mod1.regacad;

public class FactoriaEstudiante {

	public FactoriaEstudiante() {
		// TODO Auto-generated constructor stub
	}
public static Estudiante getInstance(String tipo) {
	if(tipo.equals("CEP")){
		return new EstudianteProxy(new EstudianteCep());
	}else {
		return new EstudianteColP();
	}
}
}
