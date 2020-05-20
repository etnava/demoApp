package demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "setup", "controller" })
@EntityScan(basePackages = { "model" })
@EnableJpaRepositories(basePackages = { "repository" })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	
	/*
	 * Create the model classes
	 * Create the repository
	 * Create setup dataloader (preload the data here)
	 * Create the Controller
	 * Create the service class to handle conversion from city to city DTO
	 * 
	 */
	
}

