package com.skilldistillery.events.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.events.entities.Event;

public interface EventRepo extends JpaRepository<Event, Integer> {

}
