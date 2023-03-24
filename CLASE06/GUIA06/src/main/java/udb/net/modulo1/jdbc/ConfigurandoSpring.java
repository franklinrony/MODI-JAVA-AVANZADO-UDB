package udb.net.modulo1.jdbc;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("udb.net.modulo1.jdbc")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class ConfigurandoSpring {

	public ConfigurandoSpring() {
		// TODO Auto-generated constructor stub
	}
	@Bean
	public PersistenceExceptionTranslationPostProcessor expectionTransaction() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
	
	@Bean 
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}
	
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		JpaVendorAdapter adaptador = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(adaptador);
		//mapeo a la unidad de persistencia
		em.setPersistenceUnitName("estudiante");
		return em;
	}
}
