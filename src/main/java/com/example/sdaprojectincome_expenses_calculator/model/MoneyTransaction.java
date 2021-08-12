package com.example.sdaprojectincome_expenses_calculator.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "transaction")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MoneyTransaction implements Serializable {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_type", nullable = false, updatable = false)
//    private TransactionType transactionType;
    private String transactionType;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(name = "transaction_date", nullable = false)
    private Date transactionDate;

    @ManyToMany(mappedBy = "moneyTransactions", fetch = FetchType.LAZY)
    private Set<FamilyMember> familyMembers = new HashSet<>();




}