package udb.modulo1.spring;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AspectoLog {
	private static Logger logger =  Logger.getLogger(Principal.class);
	@Before("execution(* getFacturaSinIva())")
	public void log() {
		logger.info("*** Se proceso una factura sin iva **** ");		
	}
}
