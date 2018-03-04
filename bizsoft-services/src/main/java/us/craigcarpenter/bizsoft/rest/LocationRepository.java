package us.craigcarpenter.bizsoft.rest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import us.craigcarpenter.bizsoft.model.Location;

public interface LocationRepository extends PagingAndSortingRepository<Location, Long> {
	List<Location> findByName(String name);

	List<Location> findByBusiness(Long businessId);
}