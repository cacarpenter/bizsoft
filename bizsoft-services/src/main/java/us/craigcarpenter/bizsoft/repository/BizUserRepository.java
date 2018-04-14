package us.craigcarpenter.bizsoft.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import us.craigcarpenter.bizsoft.model.BizUser;

import java.util.Optional;

public interface BizUserRepository extends PagingAndSortingRepository<BizUser, Long> {

	Optional<BizUser> findByName(@Param("name") String name);

	Optional<BizUser> findById(@Param("id") String bizUserId);
}
