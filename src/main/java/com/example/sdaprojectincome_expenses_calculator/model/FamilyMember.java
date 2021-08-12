package com.example.sdaprojectincome_expenses_calculator.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "family_member")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FamilyMember implements Serializable {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "familyMember_transaction",
            joinColumns = {@JoinColumn(name = "familyMember_id", referencedColumnName = "id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "transaction_id", referencedColumnName = "id", nullable = false, updatable = false)})
    private Set<MoneyTransaction> moneyTransactions = new HashSet<>();
}