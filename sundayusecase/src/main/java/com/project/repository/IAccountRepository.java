package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.BankDetails;

public interface IAccountRepository extends JpaRepository<BankDetails, Integer> {

}
