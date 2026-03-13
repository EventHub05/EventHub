package com.eventhub.Eventhub.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;

    private String eventDate;

    private String eventType;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;

    public Event() {
    }

    public Event(Long id, String eventName, String eventDate, String eventType, Venue venue) {
        this.id = id;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventType = eventType;
        this.venue = venue;
    }

    public Long getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEventType() {
        return eventType;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}