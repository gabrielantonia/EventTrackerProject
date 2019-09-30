package com.skilldistillery.events.entities;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Event {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="event_date")
	private Date eventDate;
	
	@CreationTimestamp
	@Column(name="created_on")
	private LocalDateTime createdOn;
	
	@UpdateTimestamp
	@Column(name="updated_on")
	private LocalDateTime updatedOn;
	
	private String name;
	
	private String title;
	
	private String description;
	
	private Integer attending;
	
	private String required;
	
	
	
	
	public Event(int id, Date eventDate, LocalDateTime createdOn, LocalDateTime updatedOn, String name,
			String title, String description, Integer attending, String required) {
		super();
		this.id = id;
		this.eventDate = eventDate;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.name = name;
		this.title = title;
		this.description = description;
		this.attending = attending;
		this.required = required;
	}

	public Event() {
		super();
	}

	public Event(int id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Integer getAttending() {
		return attending;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public String getDescription() {
		return description;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRequired() {
		return required;
	}

	public String getTitle() {
		return title;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	public void setAttending(Integer attending) {
		this.attending = attending;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
}
