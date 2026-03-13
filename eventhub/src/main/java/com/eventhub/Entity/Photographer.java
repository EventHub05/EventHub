package com.eventhub.Entity;

	
	import jakarta.persistence.*;

	@Entity
	public class Photographer {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String experience;
	    private double price;

	    public Photographer() {}

	    public Long getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getExperience() {
	        return experience;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setExperience(String experience) {
	        this.experience = experience;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	}


