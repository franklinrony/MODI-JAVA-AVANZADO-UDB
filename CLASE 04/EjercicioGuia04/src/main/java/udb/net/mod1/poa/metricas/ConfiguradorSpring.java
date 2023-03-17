package udb.net.mod1.poa.metricas;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("udb.net,mod1.poa.*")
@EnableAspectJAutoProxy
public class ConfiguradorSpring {

}
