package com.example.sdaprojectincome_expenses_calculator.service;

import com.example.sdaprojectincome_expenses_calculator.model.MoneyTransaction;
import com.example.sdaprojectincome_expenses_calculator.repository.MoneyTransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MoneyTransactionService {

    private final MoneyTransactionRepository moneyTransactionRepository;

    public MoneyTransaction addMoneyTransaction (MoneyTransaction moneyTransaction) {
        return moneyTransactionRepository.save(moneyTransaction);
    }

}
