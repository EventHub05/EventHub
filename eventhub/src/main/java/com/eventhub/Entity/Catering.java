package com.eventhub.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

	@Entity
	public class Catering {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String type;
	    private double price;

	    public Catering() {}

	    public Long getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getType() {
	        return type;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }


}
