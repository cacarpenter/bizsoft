package us.craigcarpenter.bizsoft.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NaturalId;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// just name because first/last etc is not universal
    @Column(nullable = false)
	private String name;
	
    @ManyToOne(optional = false)
	@NaturalId
	private Business business;
    
	@OneToMany
	private final List<Skill> skills = new ArrayList<>();

	protected Employee() {
	}
	
	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
