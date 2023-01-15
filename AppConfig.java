package com.training.weekmvc.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.training.weekmvc")
@EnableWebMvc
//JPA BASE PACKAGES----
@EnableJpaRepositories(basePackages="com.training.weekmvc")
@EnableTransactionManagement
public class AppConfig {
	@Bean
	public InternalResourceViewResolver resolve() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driver = new DriverManagerDataSource();
		driver.setUrl("jdbc:mysql://localhost:3306/infinite");
		driver.setUsername("root");
		driver.setPassword("Rootadmin@123");
		driver.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driver;	
	}
//	@Bean
//	public LocalEntityManagerFactoryBean factory() {
//		LocalEntityManagerFactoryBean factory = new LocalEntityManagerFactoryBean();
//		factory.setPersistenceUnitName("JPASpringMvc");
//		return factory;
//	}
//	@Bean
//	public JpaTransactionManager tranctionManager(EntityManagerFactory entityManagerFactory) {
//		JpaTransactionManager tranctionManager = new JpaTransactionManager();
//		tranctionManager.setEntityManagerFactory(entityManagerFactory);
//		return tranctionManager;
//	}
}