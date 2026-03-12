package com.eventhub.Eventhub.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "venues")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String venueName;

    private String location;

    private int capacity;

    private double price;

    public Venue() {
    }

    public Venue(Long id, String venueName, String location, int capacity, double price) {
        this.id = id;
        this.venueName = venueName;
        this.location = location;
        this.capacity = capacity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getVenueName() {
        return venueName;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
