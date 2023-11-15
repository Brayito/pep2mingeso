package tingeso.backendcuotasservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BackendCuotasServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendCuotasServiceApplication.class, args);
	}

}
