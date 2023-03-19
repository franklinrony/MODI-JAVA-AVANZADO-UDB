package udb.net.modulo1.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstudianteService {
@Autowired
EstudianteRepositoryPlantilla repositorio;
@Transactional
public void insertarVarios(Estudiante e1,Estudiante e2) {
	repositorio.insertar(e1);
	repositorio.insertar(e2);
}
	public EstudianteService() {
		// TODO Auto-generated constructor stub
	}

}
