package com.microservice.eurekaclientsecond.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CrickBuzzController {

	@Autowired
	private RestTemplate rest;
	
	@GetMapping("/thirdpartyservice")
	public String getLiveMatchScores() {
	ResponseEntity<String> response=rest.getForEntity("http://first-service/getCricketDetails", String.class);
	return response.getBody();
		
	}
	
}
