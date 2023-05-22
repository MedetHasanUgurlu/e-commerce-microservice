package org.medron.stockservice;

import org.medron.commonservice.constant.PathConstant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {PathConstant.BasePackage,PathConstant.StockServicePackage})
public class StockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockServiceApplication.class, args);
	}

}
