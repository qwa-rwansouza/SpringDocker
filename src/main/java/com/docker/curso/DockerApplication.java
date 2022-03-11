package com.docker.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {

	public static void main(String[] args) {
		try {
			Thread.sleep(100000);
		} catch (Exception e) {
			//TODO: handle excepti
			e.printStackTrace();
		}
		
		SpringApplication.run(DockerApplication.class, args);
	}

}
