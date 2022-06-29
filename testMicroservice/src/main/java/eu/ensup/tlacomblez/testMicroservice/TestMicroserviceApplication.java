package eu.ensup.tlacomblez.testMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TestMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMicroserviceApplication.class, args);
	}

}
