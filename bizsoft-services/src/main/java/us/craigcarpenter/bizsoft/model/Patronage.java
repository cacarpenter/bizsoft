package us.craigcarpenter.bizsoft.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Patronage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Customer customer;

	@ManyToOne
	private Location location;
    
	private LocalDateTime visitTime;
	
	protected Patronage() {}
	
	public Patronage(Customer cust, Location loc) {
		this.customer = cust;
		this.location = loc;
		this.visitTime = LocalDateTime.now();
	}
}
