package us.craigcarpenter.bizsoft.rest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import us.craigcarpenter.bizsoft.model.Skill;

@RepositoryRestResource
public interface SkillRepository extends PagingAndSortingRepository<Skill, Long> {

        List<Skill> findByName(@Param("name") String name);

}
