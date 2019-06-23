package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.CustomerMetaData;

public interface IUserRepository extends JpaRepository<CustomerMetaData, Integer> {

}
