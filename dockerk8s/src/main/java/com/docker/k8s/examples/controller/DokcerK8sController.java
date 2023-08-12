package com.docker.k8s.examples.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@GetMapping("/getData")
	public ResponseEntity<Object> getMessageData() {
		List list=Stream.of("laptop", "dell", "sony", "mac").collect(Collectors.toList());
		return new ResponseEntity<Object>(list, HttpStatus.OK);
		
	}
}
