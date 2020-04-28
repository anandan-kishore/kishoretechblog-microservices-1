package com.kk.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello! [Running on Port: "+environment.getProperty("local.server.port")+"]";
	}

}
