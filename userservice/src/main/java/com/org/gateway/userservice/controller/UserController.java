package com.org.gateway.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{

	@GetMapping("/getPublicAddress")
	public String getPublicAddress()
	{
		return "Public Address";
	}

}
