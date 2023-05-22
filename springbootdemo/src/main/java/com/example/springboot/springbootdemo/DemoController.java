package com.example.springboot.springbootdemo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrl1")
public class DemoController {
	
	@DeleteMapping("/delete")
	public String greeting4() {
		return "delete mapping is called";
	}
	
	@GetMapping("/post")
	public String greeting1() {
		return "get mapping is called";
	}

	@GetMapping("/get")
	public String greeting5() {
		return "get mapping is called";
	}
	
	@PostMapping("/post")
	public String greeting2() {
		return "post mapping is called";
	}
	
	@PutMapping("/put")
	public String greeting3() {
		return "put mapping is called";
	}

}
