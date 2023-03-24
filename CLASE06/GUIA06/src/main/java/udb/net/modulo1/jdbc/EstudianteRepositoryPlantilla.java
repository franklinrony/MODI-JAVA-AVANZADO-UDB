package udb.net.modulo1.jdbc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public class EstudianteRepositoryPlantilla {
	@PersistenceContext EntityManager em;
	
	public EstudianteRepositoryPlantilla() {	
		
	}
	
	public List<Estudiante>buscarTodos(){
		TypedQuery<Estudiante> consultaJPA=em.createQuery("SELECT f FROM Estudiante f",Estudiante.class);
		return consultaJPA.getResultList();
	}

	public void insertar(Estudiante estudiante) {
		em.persist(estudiante);
	}
	
	public void borrar(Estudiante estudiante) {
		em.remove(em.merge(estudiante));
	}
	
	public void actualizar(Estudiante estudiante) {
		em.merge(estudiante);
	}
}
