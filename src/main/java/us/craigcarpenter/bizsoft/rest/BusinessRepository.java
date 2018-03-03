package us.craigcarpenter.bizsoft.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import us.craigcarpenter.bizsoft.model.Business;

public interface BusinessRepository extends PagingAndSortingRepository<Business, Long> {

	Business findByName(@Param("name") String name);

}
