package ch.leinweber.playground.rest.dtos;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
public class EventDto implements Serializable {
    private final Long id;
    @NotBlank
    private final String title;
    @NotNull
    private final LocalDateTime start;
}
