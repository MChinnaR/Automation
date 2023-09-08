package com.automation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automation.service.AWSService;

@RestController
@RequestMapping("/aws")
public class AWSController {

	private static final Logger log = LoggerFactory.getLogger(AWSController.class);

	private final AWSService service;

	@Autowired
	public AWSController(AWSService service) {
		this.service = service;
	}

	@GetMapping("/")
	public String hello() {
		log.info("Hello");
		return "Your inside the applciation";
	}
}
