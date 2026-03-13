package com.eventhub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventhub.Entity.Photographer;

	public interface PhotographerRepository extends JpaRepository<Photographer, Long> {

	}


