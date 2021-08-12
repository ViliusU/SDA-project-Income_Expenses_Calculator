package com.example.sdaprojectincome_expenses_calculator.repository;

import com.example.sdaprojectincome_expenses_calculator.model.MoneyTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyTransactionRepository extends JpaRepository<MoneyTransaction, Long> {
}
