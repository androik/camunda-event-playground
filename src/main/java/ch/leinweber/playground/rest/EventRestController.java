package ch.leinweber.playground.rest;

import ch.leinweber.playground.persistence.entities.Event;
import ch.leinweber.playground.persistence.repositories.EventRepository;
import ch.leinweber.playground.rest.dtos.EventDto;
import ch.leinweber.playground.rest.requests.EventPostRequest;
import ch.leinweber.playground.rest.responses.EventPostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventRestController {

    private final EventRepository eventRepository;

    @PostMapping
    public ResponseEntity<EventPostResponse> postEvent(@Valid @RequestBody EventPostRequest request) {
        Event event = Event.builder()
                .title(request.getEvent().getTitle())
                .start(request.getEvent().getStart())
                .build();

        event = eventRepository.save(event);

        return ResponseEntity
                .ok(
                        EventPostResponse.builder()
                                .event(
                                        EventDto.builder()
                                                .id(event.getId())
                                                .title(event.getTitle())
                                                .start(event.getStart())
                                                .build()
                                )
                                .build()
                );
    }

}
