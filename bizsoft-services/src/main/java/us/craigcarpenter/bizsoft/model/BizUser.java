package us.craigcarpenter.bizsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.NaturalId;

@Entity
public class BizUser {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bizuser_id_seq")
	@SequenceGenerator(name = "bizuser_id_seq", sequenceName = "bizuser_id_seq", allocationSize = 1)
	private Long id;

	@Column(nullable = false)
	@NaturalId
	private String name;

	protected BizUser() {
	}

	public BizUser(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
