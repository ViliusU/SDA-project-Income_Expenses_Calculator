package com.example.sdaprojectincome_expenses_calculator.controller;

import com.example.sdaprojectincome_expenses_calculator.model.MoneyTransaction;
import com.example.sdaprojectincome_expenses_calculator.service.MoneyTransactionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(path = "/api/v1/moneyTransaction")
public class MoneyTransactionController {

    private final MoneyTransactionService moneyTransactionService;

    @PostMapping()
    public ResponseEntity<MoneyTransaction> addMoneyTransaction(@RequestBody MoneyTransaction moneyTransaction) {
        MoneyTransaction newMoneyTransaction = moneyTransactionService.addMoneyTransaction(moneyTransaction);
        return new ResponseEntity<>(newMoneyTransaction, HttpStatus.CREATED);
    }


    @GetMapping()
    public ResponseEntity<List<MoneyTransaction>> getAllMoneyTransactions() {
        List<MoneyTransaction> moneyTransactions = moneyTransactionService.getAllMoneyTransactions();
        return new ResponseEntity<>(moneyTransactions, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<MoneyTransaction> getMoneyTransactionById(@PathVariable("id") Long id) {
        MoneyTransaction moneyTransactionById = moneyTransactionService.findMoneyTransactionById(id);
        return new ResponseEntity<>(moneyTransactionById, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<MoneyTransaction> updateMoneyTransaction(@RequestBody MoneyTransaction moneyTransaction) {
        MoneyTransaction newUpdateMoneyTransaction = moneyTransactionService.editMoneyTransaction(moneyTransaction);
        return new ResponseEntity<>(newUpdateMoneyTransaction, HttpStatus.OK);
    }

    @DeleteMapping("{moneyTransactionId}")
    public ResponseEntity<?> deleteMoneyTransaction(@PathVariable("moneyTransactionId") Long moneyTransactionId) {
        moneyTransactionService.eraseMoneyTransaction(moneyTransactionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
