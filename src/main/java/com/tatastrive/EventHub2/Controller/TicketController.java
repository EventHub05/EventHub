package com.tatastrive.EventHub2.Controller;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import com.tatastrive.EventHub2.Entity.Ticketentity;
	import com.tatastrive.EventHub2.Service.TicketService;

	@RestController
	@RequestMapping("/api/tickets")
	public class TicketController {

	    @Autowired
	    private TicketService ticketService;

	    // Create a new ticket
	    @PostMapping("/add")
	    public Ticketentity createTicket(@RequestBody Ticketentity ticket) {
	        return ticketService.createTicket(ticket);
	    }

	    // Get all tickets
	    @GetMapping("/all")
	    public List<Ticketentity> getAllTickets() {
	        return ticketService.getAllTickets();
	    }

	    // Get ticket by ID
	    @GetMapping("/{id}")
	    public Ticketentity getTicketById(@PathVariable Long id) {
	        return ticketService.getTicketById(id);
	    }

	    // Delete ticket
	    @DeleteMapping("/{id}")
	    public String deleteTicket(@PathVariable Long id) {
	        boolean deleted = ticketService.deleteTicket(id);
	        return deleted ? "Ticket deleted successfully" : "Ticket not found";
	    }

	    // Optional: Get tickets by user
	    @GetMapping("/user/{username}")
	    public List<Ticketentity> getTicketsByUser(@PathVariable("username") String userName) {
	        return ticketService.getTicketsByUser(userName);
	    }
	}



