package com.tatastrive.EventHub2;
    import jakarta.persistence.*;
	import lombok.*;

	@Entity
	@Table(name = "bookings")

	@Data
	@NoArgsConstructor
	@AllArgsConstructor

	public class Booking {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    // Event Name
	    private String eventName;

	    // User who booked
	    private String userName;

	    // Service selected (Catering, Photographer etc.)
	    private String serviceType;

	    // Event date
	    private String eventDate;

	    // Booking status
	    private String status;   // Booked / Pending / Cancelled
	}

	


