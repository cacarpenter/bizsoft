package us.craigcarpenter.bizsoft.rest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import us.craigcarpenter.bizsoft.model.Business;

@RepositoryRestResource(collectionResourceRel = "business", path = "business")
public interface BusinessRepository extends PagingAndSortingRepository<Business, Long> {

        List<Business> findByName(@Param("name") String name);

}
