package us.craigcarpenter.bizsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import us.craigcarpenter.bizsoft.model.Business;
import us.craigcarpenter.bizsoft.model.Employee;
import us.craigcarpenter.bizsoft.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
	/*
	@Bean
	public CommandLineRunner demo(EmployeeRepository repository) {
		return (args) -> {
			new Business("Sam's Burgers");
			
			// save a couple of employees
			repository.save(new Employee("Jack Bauer"));
			repository.save(new Employee("Chloe O'Brian"));
			repository.save(new Employee("Kim Bauer"));
			repository.save(new Employee("David Palmer"));
			repository.save(new Employee("Michelle Dessler"));

			// fetch all employees
			log.info("Employees found with findAll():");
			log.info("-------------------------------");
			for (Employee employee : repository.findAll()) {
				log.info(employee.toString());
			}
			log.info("");

			// fetch an individual employee by ID
			Employee employee = repository.findOne(1L);
			log.info("Employee found with findOne(1L):");
			log.info("--------------------------------");
			log.info(employee.toString());
			log.info("");

			// fetch employees by last name
			log.info("Employee found with findByName('Jack Bauer'):");
			log.info("--------------------------------------------");
			for (Employee bauer : repository.findByName("Jack Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");
		};
	}
	*/
}
