package com.example.sdaprojectincome_expenses_calculator.service;

import com.example.sdaprojectincome_expenses_calculator.model.TransactionType;
import com.example.sdaprojectincome_expenses_calculator.repository.TransactionTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TransactionTypeService {
    private final TransactionTypeRepository transactionTypeRepository;

    public List<TransactionType> findAllTransactionTypes() {
        return transactionTypeRepository.findAll();
    }

    public TransactionType findTransactionTypeById(Long id) {
        return transactionTypeRepository.getById(id);
    }
}
