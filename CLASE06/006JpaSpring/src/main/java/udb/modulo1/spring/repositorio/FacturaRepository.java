package udb.modulo1.spring.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import udb.modulo1.spring.model.Factura;
@Repository
public class FacturaRepository {
	@PersistenceContext
	private EntityManager em;
	
	public Factura getFactura(Integer id) {		
		return em.find(Factura.class,id);
	}
	
	@Transactional
	public void insertar(Factura factura) 
	{
		em.persist(factura);
	}
	
	public List<Factura> listarFacturas() {
		TypedQuery<Factura> consultaJPA = em.createQuery("select f from Factura f",Factura.class);
		return consultaJPA.getResultList();
	}
	
	
	@Transactional
	public void actualizar(Factura f) {
		em.merge(f);
	}
	
	@Transactional
	public void borrar(Factura f) {
		em.remove(em.merge(f));
	}
	
}
