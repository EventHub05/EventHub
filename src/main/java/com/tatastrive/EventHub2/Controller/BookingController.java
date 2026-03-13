package com.tatastrive.EventHub2.Controller;
    import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

    
    import com.tatastrive.EventHub2.Entity.BookingEntity;
	import com.tatastrive.EventHub2.Service.BookingService;
	

	@RestController
	@RequestMapping("/api/bookings")
	public class BookingController {

	    @Autowired
	    private BookingService bookingService;

	    // Create a new booking
	    @PostMapping
	    public BookingEntity createBooking(@RequestBody BookingEntity booking) {
	        return bookingService.createBooking(booking);
	    }

	    // Get all bookings
	    @GetMapping
	    public List<BookingEntity> getAllBookings() {
	        return bookingService.getAllBookings();
	    }

	    // Get booking by ID
	    @GetMapping("/{id}")
	    public BookingEntity getBookingById(@PathVariable Long id) {
	        return bookingService.getBookingById(id);
	    }

	    // Update booking status
	    @PutMapping("/{id}")
	    public BookingEntity updateBookingStatus(@PathVariable Long id, @RequestParam String status) {
	        return bookingService.updateBookingStatus(id, status);
	    }

	    // Delete a booking
	    @DeleteMapping("/{id}")
	    public String deleteBooking(@PathVariable Long id) {
	        boolean deleted = bookingService.deleteBooking(id);
	        if(deleted) {
	            return "Booking deleted successfully";
	        } else {
	            return "Booking not found";
	        }
	    }
	}



