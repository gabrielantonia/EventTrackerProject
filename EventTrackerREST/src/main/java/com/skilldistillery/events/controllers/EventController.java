package com.skilldistillery.events.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class EventController {
	
	@GetMapping("ping")
	public String pong() {
		return "pong";
	}
}
