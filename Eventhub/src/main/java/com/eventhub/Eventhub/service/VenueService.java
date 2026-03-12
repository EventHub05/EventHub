package com.eventhub.Eventhub.service;

import com.eventhub.Eventhub.entity.Venue;
import com.eventhub.Eventhub.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenueService {

    @Autowired
    private VenueRepository venueRepository;

    // Create Venue
    public Venue createVenue(Venue venue) {
        return venueRepository.save(venue);
    }

    // Get All Venues
    public List<Venue> getAllVenues() {
        return venueRepository.findAll();
    }

    // Get Venue By ID
    public Venue getVenueById(Long id) {
        Optional<Venue> venue = venueRepository.findById(id);
        return venue.orElse(null);
    }

    // Update Venue
    public Venue updateVenue(Long id, Venue venueDetails) {
        Optional<Venue> optionalVenue = venueRepository.findById(id);

        if (optionalVenue.isPresent()) {
            Venue venue = optionalVenue.get();
            venue.setVenueName(venueDetails.getVenueName());
            venue.setLocation(venueDetails.getLocation());
            venue.setCapacity(venueDetails.getCapacity());
            venue.setPrice(venueDetails.getPrice());

            return venueRepository.save(venue);
        }

        return null;
    }

    // Delete Venue
    public void deleteVenue(Long id) {
        venueRepository.deleteById(id);
    }
}