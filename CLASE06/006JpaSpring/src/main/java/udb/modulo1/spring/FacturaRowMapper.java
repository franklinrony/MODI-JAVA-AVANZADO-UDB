package udb.modulo1.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import udb.modulo1.spring.model.Factura;

// convierte jdbc filas de base de datos a objetos java
public class FacturaRowMapper implements RowMapper<Factura> {

	@Override
	public Factura mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new Factura(rs.getInt("numero"),rs.getString("concepto"),rs.getDouble("importe"));		 
	}

}
