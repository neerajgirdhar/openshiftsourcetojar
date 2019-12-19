package com.example.springboot.dataservice.controller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
@RequestMapping("/checkDocker")

public class RestControllerUserService {

	private static final Logger log = LoggerFactory
			.getLogger(RestControllerUserService.class);



	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getDetails()
			throws IOException, InterruptedException {
log.info("Sleeping");
		
		log.info("awake now....after a tiny nap");
		String customvalue = System.getenv().get("customvalue");
		String hostname = System.getenv().get("HOSTNAME");
		return customvalue + hostname;
	}

}
