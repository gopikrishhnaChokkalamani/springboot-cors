package com.gi.springboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "*" }, exposedHeaders = {
		"hi", "User" }, maxAge = 6000)
@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping
	public String getMethod() {
		return "hello";
	}
}
