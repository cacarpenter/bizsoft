package us.craigcarpenter.bizsoft.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import us.craigcarpenter.bizsoft.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByName(String name);
}