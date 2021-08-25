package com.example.sdaprojectincome_expenses_calculator.repository;

import com.example.sdaprojectincome_expenses_calculator.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionTypeRepository extends JpaRepository<TransactionType, Long> {

}
