package com.armando.Burger.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="burgers")
public class Burger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//Burger name
	@NotNull
	@Size(min = 3, max = 100, message = "burger name must not be empty")
	private String name;
	//Restaurant name
	@NotNull
	@Size(min = 5, max = 10, message = "Restaurant must not be empty")
	private String RestaurantName;
	//Rating
	@NotNull
	@Min(0)
	@Max(5)
	private Integer rating;
	//Notes
	@NotNull
	@Size(min = 5, max = 155, message = "Notes must not be empty")
	private String notes;
	// This will not allow the createdAt column to be updated after creation	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	private Date updatedAt;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRestaurantName() {
		return RestaurantName;
	}


	public void setRestaurantName(String restaurantName) {
		this.RestaurantName = restaurantName;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}
	

	public Burger() {
	}
	
    // other getters and setters removed for brevity
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
