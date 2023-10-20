package com.armando.SaveTravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="travels")
public class Travel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//Expense
	@NotNull
	@Size(min=2, max=255, message = "Expense must not be null.")
	private String expense;
	//Vendor
	@NotNull
	@Size(min = 5, max = 255, message = "Vendor must not be null.")
	private String vendor;
	//Amount
	@NotNull(message = "amount must not be null.")
	@Min(value=0, message="Amount must not be 0.")
	private Double amount;
	//Descriptions
	@NotNull
	@Size(min = 5, max = 255, message = "Description must not be empty")
	private String description;
	
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
	
	public String getExpense() {
		return expense;
	}
	public void setExpense(String expense) {
		this.expense = expense;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Travel() {
	}
	
	
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
}
