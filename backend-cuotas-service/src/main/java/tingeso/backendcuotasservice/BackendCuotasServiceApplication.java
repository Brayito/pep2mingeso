package tingeso.backendcuotasservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class BackendCuotasServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendCuotasServiceApplication.class, args);
	}

}