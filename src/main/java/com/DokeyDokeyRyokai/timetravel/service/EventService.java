package com.DokeyDokeyRyokai.timetravel.service;

import com.DokeyDokeyRyokai.timetravel.model.Event;
import java.util.List;

public interface EventService {
    List<Event> getAllEvents();
    Event getEventById(Long id);
    Event createEvent(Event event);
    Event updateEvent(Long id, Event eventDetails);
    void deleteEvent(Long id);
}
