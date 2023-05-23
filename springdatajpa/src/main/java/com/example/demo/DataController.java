package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@Autowired
	DataService service;
	
	@PostMapping("/data")
	public Ssc createData(@RequestBody Ssc ssc) {
		return service.postData(ssc);
	}
	
	
	@GetMapping("/data")
	public List<Ssc> showAll(){
		return service.getAllData();
	}
}
