package com.skilldistillery.events.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.events.entities.Event;
import com.skilldistillery.events.services.EventService;


@RestController
@RequestMapping("api")
public class EventController {
	
	
	@Autowired
	EventService serv ;
	
	@GetMapping("ping")
	public String pong() {
		return "pong";
	}
	
	@GetMapping("event")
	public List<Event> index() {
		return serv.getAll();
	}
	
	@GetMapping("event/{id}")
	public Optional<Event> findById(@PathVariable("id") Integer id) {
		return serv.findById(id);
	}
	
	
	@PostMapping("event/new")
	public Event createNewEvent(@RequestBody Event newEvent) {
		return serv.createNewEvent(newEvent);
	}
	
	
	@PatchMapping("event/update/{id}")
	public Event update(@RequestBody Event updateEvent, @PathVariable("id") Integer id ) {
		return serv.updateEvent(id, updateEvent);
	}
	@DeleteMapping("event/{id}")
	public boolean removeEvent(@PathVariable("id") Integer id) {
		return serv.removeEvent(id);
	}
}
