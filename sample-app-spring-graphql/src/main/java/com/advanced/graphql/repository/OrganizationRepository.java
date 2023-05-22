package com.advanced.graphql.repository;

import com.advanced.graphql.entity.Organization;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepository extends CrudRepository<Organization, Integer>,
        JpaSpecificationExecutor<Organization> {
}
