package com.docker.k8s.examples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dokcerk8s")
public class DokcerK8sController {
	
	
	
	@GetMapping("/getMessage")
	public String getMessageFromK8s() {
		return "Welcome Docker Container from k8s";
	}
}
