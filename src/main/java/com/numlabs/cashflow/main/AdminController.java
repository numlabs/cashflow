package com.numlabs.cashflow.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
