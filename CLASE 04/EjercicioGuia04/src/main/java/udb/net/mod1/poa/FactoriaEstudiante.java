package udb.net.mod1.poa;

public class FactoriaEstudiante {

	public FactoriaEstudiante() {
		// TODO Auto-generated constructor stub
	}
public static Estudiante getInstance(String tipo) {
	if(tipo.equals("CEP")){
		//Modificado para incluir clase proxy
		return new EstudianteProxy(new EstudianteCep());
	}else {
		return new EstudianteColP();
	}
}
}
