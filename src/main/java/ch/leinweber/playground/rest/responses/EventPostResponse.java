package ch.leinweber.playground.rest.responses;

import ch.leinweber.playground.rest.dtos.EventDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EventPostResponse {
    private EventDto event;
}
