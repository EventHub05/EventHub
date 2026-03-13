package com.eventhub.Eventhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventhub.Eventhub.entity.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}