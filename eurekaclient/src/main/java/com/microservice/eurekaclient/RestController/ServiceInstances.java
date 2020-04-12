package com.microservice.eurekaclient.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.eurekaclient.model.Cricket;

import org.springframework.cloud.client.ServiceInstance;

@RestController
public class ServiceInstances {

	@Autowired
	private DiscoveryClient discoverClient;
	
	@Autowired
	private Cricket cricket;
	
	@RequestMapping("/service-instances/{appname}")
	public List<ServiceInstance> getAllServiceInstances(@PathVariable String appname){
		return this.discoverClient.getInstances(appname);
	}
	
	@GetMapping(path="/getCricketDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cricket>  getCricketDetails(){
		//Cricket cricket= new Cricket();
		cricket.setTeam1("India");
		cricket.setTeam2("Australia");
		cricket.setRunsscoredbyteam1("200");
		cricket.setRunsscoredbyteam2("199");
		cricket.setTotalwickets("20");
		return Arrays.asList(cricket);
		
	}
}
