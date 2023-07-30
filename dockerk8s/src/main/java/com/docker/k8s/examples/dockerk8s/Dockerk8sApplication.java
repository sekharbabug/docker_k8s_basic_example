package com.docker.k8s.examples.dockerk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.docker.k8s.examples")
public class Dockerk8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dockerk8sApplication.class, args);
	}

}
