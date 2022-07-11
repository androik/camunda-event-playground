package ch.leinweber.playground.persistence.repositories;

import ch.leinweber.playground.persistence.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
