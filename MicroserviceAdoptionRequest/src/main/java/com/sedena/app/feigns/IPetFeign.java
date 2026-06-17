package com.sedena.app.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sedena.app.entities.AdoptionStatus;
import com.sedena.app.entities.Pet;

// before Eureka
// @FeignClient(name = "microservicepet", url = "http://localhost:9091")

// after Eureka
@FeignClient(name = "microservicepet")
public interface IPetFeign {
	@GetMapping("/pet/id/{id}")
	Pet findById(@PathVariable("id") long id);
	
	@PutMapping("/pet/status")
	String updateAdoptionStatus(@RequestParam("id") long id, @RequestParam("status") AdoptionStatus status);
}