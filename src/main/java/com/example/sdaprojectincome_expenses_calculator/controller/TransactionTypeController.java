package com.example.sdaprojectincome_expenses_calculator.controller;

import com.example.sdaprojectincome_expenses_calculator.model.TransactionType;
import com.example.sdaprojectincome_expenses_calculator.service.TransactionTypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping(path = "/api/v1/transactionType")
public class TransactionTypeController {

    private final TransactionTypeService transactionTypeService;

    @GetMapping()
    public ResponseEntity<List<TransactionType>> getAllTransactionTypes() {
        List<TransactionType> transactionTypes = transactionTypeService.findAllTransactionTypes();
        return new ResponseEntity<>(transactionTypes, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<TransactionType> getTransactionTypeById(@PathVariable("id") Long id) {
        TransactionType transactionTypeById = transactionTypeService.findTransactionTypeById(id);
        return new ResponseEntity<>(transactionTypeById, HttpStatus.OK);
    }
}
