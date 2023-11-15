package eskandar.ou.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan("ma.projet.entities")
@EnableJpaRepositories (basePackages = "ma.projet.repositories")
@ComponentScan(basePackages = {"ma.projet.services","ma.projet.controller"})

@SpringBootApplication
public class ControleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}

}
