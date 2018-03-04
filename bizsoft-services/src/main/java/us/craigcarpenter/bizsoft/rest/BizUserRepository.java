package us.craigcarpenter.bizsoft.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import us.craigcarpenter.bizsoft.model.BizUser;

public interface BizUserRepository extends PagingAndSortingRepository<BizUser, Long> {

	BizUser findByName(@Param("name") String name);

}
