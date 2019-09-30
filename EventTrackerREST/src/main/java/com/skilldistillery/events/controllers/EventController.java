package com.skilldistillery.events.controllers;


import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.events.entities.Event;
import com.skilldistillery.events.services.EventServiceImpl;

@RestController
@RequestMapping("api")
public class EventController {
	
	
	@Autowired
	EventServiceImpl serv;
	
	@GetMapping("ping")
	public String pong() {
		return "pong";
	}
	
	@GetMapping("event")
	public List<Event> index() {
		return serv.getAll();
	}
	
	@GetMapping("event/{id}")
	public Event findById(@PathVariable("id") Integer id) {
		return serv.findById(id);
	}
	
	@CreationTimestamp
	@PostMapping("event/new")
	public Event createNewEvent(@RequestBody Event newEvent) {
		return serv.createNewEvent(newEvent);
	}
	
	@UpdateTimestamp
	@PostMapping("event/update/{id}")
	public Event update(@RequestBody Event updateEvent, @PathVariable("id") int id ) {
		return serv.updateEvent(id, updateEvent);
	}
	@DeleteMapping("event/{id}")
	public boolean removeEvent(@PathVariable("id") Integer id) {
		return serv.removeEvent(id);
	}
}
