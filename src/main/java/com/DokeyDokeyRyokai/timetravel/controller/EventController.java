package com.DokeyDokeyRyokai.timetravel.controller;

import com.DokeyDokeyRyokai.timetravel.model.Event;
import com.DokeyDokeyRyokai.timetravel.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    // 모든 이벤트 조회
    @GetMapping
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // 특정 ID의 이벤트 조회
    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    // 새 이벤트 생성
    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    // 이벤트 업데이트
    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event eventDetails) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event != null) {

            event.setDescription(eventDetails.getDescription());
            // ... 기타 필드 업데이트
            eventRepository.save(event);
        }
        return event;
    }

    // 이벤트 삭제
    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventRepository.deleteById(id);
    }
}
