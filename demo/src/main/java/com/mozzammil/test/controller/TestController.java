package com.mozzammil.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-controller")
public class TestController {

	@GetMapping("/{hello}")
	public String getSpanishGreetingById() {
		return "Hello from RestApi"; // list index starts with 0 but we prefer to start on 1
	}

}
