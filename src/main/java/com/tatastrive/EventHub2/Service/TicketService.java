package com.tatastrive.EventHub2.Service;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.tatastrive.EventHub2.Entity.Ticketentity;
	import com.tatastrive.EventHub2.Repository.TicketRepository;

	@Service
	public class TicketService {

	    @Autowired
	    private TicketRepository ticketRepository;

	    // Generate a new ticket
	    public Ticketentity createTicket(Ticketentity ticket) {
	        // Optional: Generate a unique ticket number
	        ticket.setTicketNumber("TICKET-" + System.currentTimeMillis());
	        return ticketRepository.save(ticket);
	    }

	    // Get all tickets
	    public List<Ticketentity> getAllTickets() {
	        return ticketRepository.findAll();
	    }

	    // Get ticket by ID
	    public Ticketentity getTicketById(Long id) {
	        Optional<Ticketentity> ticket = ticketRepository.findById(id);
	        return ticket.orElse(null);
	    }

	    // Delete ticket
	    public boolean deleteTicket(Long id) {
	        Ticketentity ticket = getTicketById(id);
	        if(ticket != null) {
	            ticketRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }

	    // Optional: Get tickets by user
	    public List<Ticketentity> getTicketsByUser(String userName) {
	        return ticketRepository.findAll()
	                .stream()
	                .filter(t -> t.getUserName().equalsIgnoreCase(userName))
	                .toList();
	    }
	}

	


