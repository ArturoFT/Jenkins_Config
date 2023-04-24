package com.cjava.practica01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CjavaPractica01ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CjavaPractica01ConfigServerApplication.class, args);
	}

}
