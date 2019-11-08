package fr.domiq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import fr.domiq.entity.Person;
import fr.domiq.service.PersonService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class TestTransactionApplication {

	@Autowired
	private PersonService personService;

	public static void main(String[] args) {
		log.info("Start of application");
		ConfigurableApplicationContext ctx = SpringApplication.run(TestTransactionApplication.class, args);
		TestTransactionApplication app = ctx.getBean(TestTransactionApplication.class);
		app.run();
		log.info("End of application");
	}

	@Transactional
	public void run() {
		log.info("Start using service");
		try {
			personService.manage(new Person());
		} catch (Exception e) {
			log.error("Exception '{}' catched", e.getClass().getName());
		}
		log.info("End using service");
	}
}
