package com.skilldistillery.events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.skilldistillery.events.entities.Event;
import com.skilldistillery.events.repositories.EventRepo;

public class EventServiceImpl implements EventService {

	@Autowired
	EventRepo repo;

	public List<Event> getAll() {
		return repo.findAll();
	}

	public Event createNewEvent(Event newEvent) {
		repo.saveAndFlush(entity)
		return null;
	}

	public Event updateEvent(int id, Event updateEvent) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeEvent(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Event findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
