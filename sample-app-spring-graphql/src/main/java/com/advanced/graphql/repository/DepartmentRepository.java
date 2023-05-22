package com.advanced.graphql.repository;

import com.advanced.graphql.entity.Department;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer>,
		JpaSpecificationExecutor<Department> {

}
