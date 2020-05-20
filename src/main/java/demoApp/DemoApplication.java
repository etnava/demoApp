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
	 * Ensure @Component & @Entity and @Id annotations
	 * Create the repository interfaces
	 * Ensure @Component annotation
	 * Create setup dataloader (preload the data here)
	 * Ensure @Component Annotation and that dataloader extends ApplicationRunner 
	 *		 and implements the method run()
	 *		@Autowired the repositories required
	 * Create the Controller
	 * 		@RestController Annotation
	 * 		@GetMapping
	 * 		@RequestMapping on the class is optional
	 * Create the service class to handle conversion from city to city DTO
	 * 		Handles conversion for City to CITYDTO, does not save in repository here.
	 * 
	 * To access h2 database
	 * http://localhost:5000/h2-console
	 * 
	 * jdbcURL =  jdbc:h2:mem:testdb
	 * user name = sa
	 */
	
}

