package tingeso.backendreporteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BackendReporteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendReporteServiceApplication.class, args);
	}

}
