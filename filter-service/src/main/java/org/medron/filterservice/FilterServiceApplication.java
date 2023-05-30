package org.medron.filterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.medron.commonservice.config","org.medron.filterservice"})
public class FilterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterServiceApplication.class, args);
	}

}
