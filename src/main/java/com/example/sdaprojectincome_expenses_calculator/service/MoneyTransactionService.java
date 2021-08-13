package com.example.sdaprojectincome_expenses_calculator.service;

import com.example.sdaprojectincome_expenses_calculator.model.MoneyTransaction;
import com.example.sdaprojectincome_expenses_calculator.repository.FamilyMemberRepository;
import com.example.sdaprojectincome_expenses_calculator.repository.MoneyTransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MoneyTransactionService {

    private final MoneyTransactionRepository moneyTransactionRepository;
    private final FamilyMemberRepository familyMemberRepository;

    public MoneyTransaction addMoneyTransaction(MoneyTransaction moneyTransaction) {
        return moneyTransactionRepository.save(moneyTransaction);
    }

    public List<MoneyTransaction> getAllMoneyTransactions() {
        return moneyTransactionRepository.findAll();
    }

    public MoneyTransaction editMoneyTransaction(MoneyTransaction moneyTransaction) {
        return moneyTransactionRepository.save(moneyTransaction);
    }

    public void eraseMoneyTransaction(Long moneyTransactionId) {
        moneyTransactionRepository.deleteById(moneyTransactionId);
    }
}
