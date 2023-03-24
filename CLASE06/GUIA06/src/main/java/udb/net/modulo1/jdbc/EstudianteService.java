package udb.net.modulo1.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstudianteService {

	public EstudianteService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	EstudianteRepositoryPlantilla repositorio;

	@Transactional
	public List<Estudiante> buscarTodos() {
		return repositorio.buscarTodos();
	}

	@Transactional
	public void insertar(Estudiante estudiante) {
		repositorio.insertar(estudiante);
	}

	@Transactional
	public void borrar(Estudiante estudiante) {
		repositorio.borrar(estudiante);
	}

	@Transactional
	public void actualizar(Estudiante estudiante) {
		repositorio.actualizar(estudiante);
	}
	
	@Transactional
	public void insertarVarios(Estudiante e1,Estudiante e2) {
		repositorio.insertar(e1);
		repositorio.insertar(e2);
	}

	public boolean equals(Object obj) {
		return repositorio.equals(obj);
	}

}
