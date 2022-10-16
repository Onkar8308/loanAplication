package com.example.loan_application.Repository;

import java.util.List;

import com.example.loan_application.Entity.LoanEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Integer>{

	//public List<LoanEntity> findloan(LoanEntity loan);

}
