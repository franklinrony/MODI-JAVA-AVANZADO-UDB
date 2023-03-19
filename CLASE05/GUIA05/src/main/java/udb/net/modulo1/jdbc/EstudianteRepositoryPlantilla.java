package udb.net.modulo1.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class EstudianteRepositoryPlantilla {
	@Autowired
	private JdbcTemplate plantilla;
	
	public EstudianteRepositoryPlantilla() {	
		
	}
	
	public List<Estudiante>buscarTodos(){
		String sql="Select codigo as codigo, nombre as nombre, apellido as apellido, cuota as cuotaMensual from estudiante";
		return plantilla.query(sql, new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	public void insertar(Estudiante estudiante) {
		String sql="insert into estudiante (codigo, nombre, apellido,cum,cuota) values(?,?,?,?,?)";
		plantilla.update(sql,estudiante.getCodigo(),estudiante.getNombre(),estudiante.getApellido(),estudiante.getCum(),
				estudiante.getCuotaMensual());		
	}
	
	public void borrar(Estudiante estudiante) {
		String sql="delete from estudiante where codigo=?";
		plantilla.update(sql,estudiante.getCodigo());
	}
	
	public void actualizar(Estudiante estudiante) {
		String sql="update estudiante set nombre=?, apellido=?, cum=?, cuota=? where codigo=?";
		plantilla.update(sql, estudiante.getNombre(),estudiante.getApellido(),
				estudiante.getCum(),estudiante.getCuotaMensual(),estudiante.getCodigo());
	}
}
