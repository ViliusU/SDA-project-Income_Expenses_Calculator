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
public class Transaction implements Serializable {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "transaction_type", nullable = false)
//    private String transactionType;

    @Column(name = "transaction_type", nullable = false, updatable = false)
    private TransactionType transactionType;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(name = "transaction_date", nullable = false)
    private Date transactionDate;



//    @Column(name = "familyMember_id", nullable = false)
//    private Long familyMember_id;
//
//    @Column(name = "transactionType_id", nullable = false)
//    private Long transactionType_id;

    @ManyToMany(mappedBy = "transactions", fetch = FetchType.LAZY)
    private Set<FamilyMember> familyMembers = new HashSet<>();

//    @OneToMany(targetEntity = FamilyMember.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "transaction_familyMember_fk", referencedColumnName = "familyMember_id")
//    Set<FamilyMember> familyMembers;
//
//    @OneToMany(targetEntity = TransactionType.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "transaction_transactionType_id_fk", referencedColumnName = "id")
//    Set<TransactionType> transactionTypes;



}
