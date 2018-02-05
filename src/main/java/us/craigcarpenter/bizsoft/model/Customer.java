package us.craigcarpenter.bizsoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customers_id_seq")
	@SequenceGenerator(name = "customers_id_seq", sequenceName = "customers_id_seq", allocationSize = 1)
	private Long id;

	private String name;

	protected Customer() {
	}

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
