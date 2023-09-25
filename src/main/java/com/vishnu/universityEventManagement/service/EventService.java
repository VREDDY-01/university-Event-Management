package com.vishnu.universityEventManagement.service;

import com.vishnu.universityEventManagement.model.Event;
import com.vishnu.universityEventManagement.repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {
	@Autowired
	EventRepo eventRepo;

	public String addEvent(Event e) {
		eventRepo.save(e);
		return "event added successfully";
	}

	public String updateEvent(Event e, Integer id) {
		Event foundEvent = eventRepo.findById(id).orElse(null);
		if (foundEvent!=null){
			foundEvent.setEventName(e.getEventName());
			foundEvent.setLocationOfEvent(e.getLocationOfEvent());
			foundEvent.setDate(e.getDate());
			foundEvent.setStartTime(e.getStartTime());
			foundEvent.setEndTime(e.getEndTime());
			eventRepo.save(foundEvent);
			return "Event updated";
		}else{
			return "error with event id "+id;
		}
	}

	public String deleteEvent(Integer id) {
		eventRepo.deleteById(id);
		return "event deleted successfully";
	}

	public List<Event> getAllEventsByDate(LocalDate date) {
		return eventRepo.findAllByDateEquals(date);
	}
}
