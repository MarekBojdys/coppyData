package pl.synchronize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSynchronizeDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSynchronizeDataApplication.class, args);
	}

}
