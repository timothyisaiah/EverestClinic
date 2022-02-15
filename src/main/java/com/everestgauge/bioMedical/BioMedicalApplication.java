package com.everestgauge.bioMedical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@ComponentScan("com.everestgauge.bioMedical")
public class BioMedicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BioMedicalApplication.class, args);
	}

}
