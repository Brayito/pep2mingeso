package tingeso.backendestudianteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class BackendEstudianteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendEstudianteServiceApplication.class, args);
	}

}
