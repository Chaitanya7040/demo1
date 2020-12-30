package com.cjc.app.fss.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient

public class FssMasterClientInsertApplication {

	public static void main(String[] args) {
		System.out.println("insert");
		SpringApplication.run(FssMasterClientInsertApplication.class, args);
	}

}
