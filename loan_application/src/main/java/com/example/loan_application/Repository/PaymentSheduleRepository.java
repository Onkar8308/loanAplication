package com.example.loan_application.Repository;

import com.example.loan_application.Entity.PaymentShedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentSheduleRepository extends JpaRepository<PaymentShedule, Integer>{

}
