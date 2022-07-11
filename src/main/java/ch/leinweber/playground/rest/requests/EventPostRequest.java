package ch.leinweber.playground.rest.requests;

import ch.leinweber.playground.rest.dtos.EventDto;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EventPostRequest {
    @NotNull
    private EventDto event;
}
