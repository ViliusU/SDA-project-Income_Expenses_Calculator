package com.example.sdaprojectincome_expenses_calculator.repository;

import com.example.sdaprojectincome_expenses_calculator.model.FamilyMember;
import com.example.sdaprojectincome_expenses_calculator.model.MoneyTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoneyTransactionRepository extends JpaRepository<MoneyTransaction, Long> {

//    @Query("SELECT money_transaction.name FROM money_transaction mt WHERE familyMember.id = 1")
//    List<MoneyTransaction> findMoneyTransactionByFamilyMember_Id();

}
