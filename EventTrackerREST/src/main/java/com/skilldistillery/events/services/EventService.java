package com.skilldistillery.events.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.skilldistillery.events.entities.Event;


public interface EventService {

	List<Event> getAll();

	Event createNewEvent(Event event);

	Event updateEvent(Integer id, Event updateEvent);

	boolean removeEvent(Integer id);

	Optional<Event> findById(Integer id);
	
}
