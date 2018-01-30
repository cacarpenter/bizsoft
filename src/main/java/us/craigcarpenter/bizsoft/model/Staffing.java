package us.craigcarpenter.bizsoft.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Staffing {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
    @ManyToOne
	private Employee employee;
    
    @ManyToOne
    private BizResource resource;

    @Column(nullable = false)
	private LocalDateTime startTime;

    @Column(nullable = false)
	private LocalDateTime endTime;
}
