package br.com.microservices.orchestrated.orderservice.core.controllers;

import br.com.microservices.orchestrated.orderservice.core.documents.Event;
import br.com.microservices.orchestrated.orderservice.core.dtos.EventFilters;
import br.com.microservices.orchestrated.orderservice.core.services.EventService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/event")
public class EventController {

    private final EventService eventService;

    @PostMapping
    public Event findByFiters(@RequestBody EventFilters filters) {
        return  eventService.findByFilters(filters);
    }

    @GetMapping("all")
    public List<Event> findBAll() {
         return eventService.findAll();
    }


}
