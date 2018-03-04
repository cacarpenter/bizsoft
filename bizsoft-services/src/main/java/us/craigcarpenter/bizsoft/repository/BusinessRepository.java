package us.craigcarpenter.bizsoft.repository;

import org.springframework.data.repository.CrudRepository;

import us.craigcarpenter.bizsoft.model.Business;

public interface BusinessRepository extends CrudRepository<Business, Long> {
	Business findByName(String name);

}
