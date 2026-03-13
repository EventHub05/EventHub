package com.tatastrive.EventHub2.Repository;
	

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tatastrive.EventHub2.Entity.BookingEntity;

	

	@Repository
	public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
}



