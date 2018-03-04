package us.craigcarpenter.bizsoft.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.NaturalId;

@Entity
public class Business {
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "businesses_id_seq")
	@SequenceGenerator(name = "businesses_id_seq", sequenceName = "businesses_id_seq", allocationSize = 1)
	private Long id;

	@Column(nullable = false)
	@NaturalId
	private String name;

	@OneToMany
	private final List<Employee> employees = new ArrayList<>();

	@OneToMany
	private final List<Location> locations = new ArrayList<>();

	protected Business() {
	}

	public Business(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
