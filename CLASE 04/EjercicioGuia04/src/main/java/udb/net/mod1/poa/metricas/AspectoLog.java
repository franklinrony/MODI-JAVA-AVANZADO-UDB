package udb.net.mod1.poa.metricas;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AspectoLog {
	@Around("execution(* udb.net.mod1.poa.metricas.*.*())")
	public void tiempoPasado(ProceedingJoinPoint punto)throws Throwable{
		//inicio primer metodo
		Long tiempo1=System.currentTimeMillis();
		punto.proceed();
		//inicio segundo metodo
		Long tiempo2=System.currentTimeMillis();
		Long total=tiempo2-tiempo1;
		if(total>2000) {
			System.out.format("El metodo es: %s y el tiempo transcurrido %d\n", punto.getSignature().getName(),total);
		}
	}
}
