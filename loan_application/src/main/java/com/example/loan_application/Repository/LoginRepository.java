package com.example.loan_application.Repository;

import com.example.loan_application.Entity.CustomerLoginEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<CustomerLoginEntity, Integer>{

}
