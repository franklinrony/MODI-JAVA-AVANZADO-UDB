package udb.modulo1.spring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("udb.modulo1.spring")
@EnableAspectJAutoProxy
@PropertySource("classpath:database.properties")
public class ConfiguradorSpring {
	@Value("${url}")
	String url;
	@Value("${usuario}")
	String usuario;
	@Value("${password}")
	String password;
	
	
	@Bean
	public DataSource dataSource() {		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();		
		dataSource.setUrl(url);
		dataSource.setUsername(usuario);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate asignarPlantilla() {
		return new JdbcTemplate(dataSource());
	}

}
