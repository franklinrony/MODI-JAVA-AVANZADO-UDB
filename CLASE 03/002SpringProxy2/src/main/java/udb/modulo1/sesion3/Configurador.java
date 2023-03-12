package udb.modulo1.sesion3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("udb.modulo1.sesion3")
@Configuration
public class Configurador {
	@Bean
	public Factura facturaSinIva() {
		return new FacturaSinIva(1,"Computador",200.40);
	}
	public Configurador() {
		// TODO Auto-generated constructor stub
	}

}
