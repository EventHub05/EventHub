package com.eventhub.Eventhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventhub.Eventhub.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}