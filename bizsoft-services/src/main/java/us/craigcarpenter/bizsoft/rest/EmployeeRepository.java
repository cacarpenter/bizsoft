package us.craigcarpenter.bizsoft.rest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import us.craigcarpenter.bizsoft.model.Employee;

@RepositoryRestResource
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    List<Employee> findByName(String name);
}