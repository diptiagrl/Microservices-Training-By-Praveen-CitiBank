package com.example.springboot.springbootdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrl2")
public class DemoController2 {
	
	@GetMapping("/data")
	public String getDriverData(@RequestParam("driver")String driver,
			@RequestParam("db")String db) {
		return driver+" is using database :"+db;
	}
	
	@GetMapping("/name/{ename}/{city}")
	public String getName(@PathVariable("ename") String name, @PathVariable String city) {
		return "Hello, "+name+" Welcome to "+city;
	}
	
	@GetMapping("/get")
	public String test() {
		return "get mapping another controller is called";
	}
	
	@PostMapping("/emp")
	public String getEmp2(@RequestBody Employee emp) {
		return "Hello "+emp.getName()+" welcome to "+emp.getDept();
	}
	
	@GetMapping("/emp")
	public ResponseEntity<Employee> getEmp1() {
		Employee emp = new Employee(10001,"praveen","finance");
		
		return new ResponseEntity<>(emp,HttpStatus.ACCEPTED);
	}

}
