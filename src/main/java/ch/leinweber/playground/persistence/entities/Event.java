package ch.leinweber.playground.persistence.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank
    @Column(name = "title", nullable = false)
    private String title;

    @NotNull
    @Column(name = "start", nullable = false)
    private LocalDateTime start;

    @OneToMany(mappedBy = "event", orphanRemoval = true)
    private Set<Participant> participants = new LinkedHashSet<>();

}