package com.skilldistillery.events.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.events.entities.Event;
import com.skilldistillery.events.repositories.EventRepo;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepo repo;
	
	@Override
	public List<Event> getAll() {
		return repo.findAll();
	}
	@Override
	public Event createNewEvent(Event event) {
		
		return repo.saveAndFlush(event);
	}
	@Override
	public Event updateEvent(Integer id, Event updateEvent) {
		Event managedEvent = null;
		Optional<Event> optEvent = repo.findById(id);
		if(optEvent.isPresent()) {
			managedEvent = optEvent.get();
			managedEvent.setName(updateEvent.getName());
			managedEvent.setAttending(updateEvent.getAttending());
			managedEvent.setDescription(updateEvent.getDescription());
			managedEvent.setEventDate(updateEvent.getEventDate());
			managedEvent.setTitle(updateEvent.getTitle());
			managedEvent.setRequired(updateEvent.getRequired());
			managedEvent.setUpdatedOn(updateEvent.getUpdatedOn());
			repo.save(managedEvent);
		}
		return managedEvent;
	}
	
	
	@Override
	public boolean removeEvent(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return true;
		}
		return false;
	}
	@Override
	public Optional<Event> findById(Integer id) {
		
		return repo.findById(id);
	}
	
	
}
