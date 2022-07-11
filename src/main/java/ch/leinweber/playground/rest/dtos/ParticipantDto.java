package ch.leinweber.playground.rest.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class ParticipantDto implements Serializable {
    private final Long id;
    @NotBlank
    private final String firstName;
    @NotBlank
    private final String lastName;
    @Email
    @NotBlank
    private final String email;
}
