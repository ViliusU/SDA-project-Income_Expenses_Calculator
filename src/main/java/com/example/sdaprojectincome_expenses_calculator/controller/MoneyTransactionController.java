package com.example.sdaprojectincome_expenses_calculator.controller;

import com.example.sdaprojectincome_expenses_calculator.model.MoneyTransaction;
import com.example.sdaprojectincome_expenses_calculator.service.MoneyTransactionService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping(path = "/api/v1/moneyTransaction")
public class MoneyTransactionController {

    private final MoneyTransactionService moneyTransactionService;

    @GetMapping(path = "/add")
    public ResponseEntity<MoneyTransaction> addMoneyTransaction(@RequestBody MoneyTransaction moneyTransaction) {
        MoneyTransaction newMoneyTransaction = moneyTransactionService.addMoneyTransaction(moneyTransaction);
        return new ResponseEntity<>(newMoneyTransaction, HttpStatus.CREATED);
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<MoneyTransaction>> getAllMoneyTransactions() {
        List<MoneyTransaction> moneyTransactions = moneyTransactionService.getAllMoneyTransactions();
        return new ResponseEntity<>(moneyTransactions, HttpStatus.OK);
    }
}
