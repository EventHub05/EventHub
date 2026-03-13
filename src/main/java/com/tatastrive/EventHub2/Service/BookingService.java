package com.tatastrive.EventHub2.Service;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	
	import com.tatastrive.EventHub2.Repository.BookingRepository;
	import com.tatastrive.EventHub2.Entity.BookingEntity;

	

	@Service
	public class BookingService {

	    @Autowired
	    private BookingRepository bookingRepository;

	    // Create a new booking
	    public BookingEntity createBooking(BookingEntity booking) {
	        booking.setStatus("Pending"); // default status
	        return bookingRepository.save(booking);
	    }

	    // Get all bookings
	    public List<BookingEntity> getAllBookings() {
	        return bookingRepository.findAll();
	    }

	    // Get booking by ID
	    public BookingEntity getBookingById(Long id) {
	        Optional<BookingEntity> booking = bookingRepository.findById(id);
	        return booking.orElse(null);
	    }

	    // Update booking status
	    public BookingEntity updateBookingStatus(Long id, String status) {
	        BookingEntity booking = getBookingById(id);
	        if (booking != null) {
	            booking.setStatus(status);
	            return bookingRepository.save(booking);
	        }
	        return null;
	    }

	    // Delete booking
	    public boolean deleteBooking(Long id) {
	        BookingEntity booking = getBookingById(id);
	        if (booking != null) {
	            bookingRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
	}



