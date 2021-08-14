package com.example.sdaprojectincome_expenses_calculator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "money_transaction")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class MoneyTransaction implements Serializable {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_type", nullable = false, updatable = false)
//    private TransactionType transactionType;
    private String transactionType;

    @Column(name = "transaction_description",nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(name = "transaction_date",nullable = false)
    private Date transactionDate;

    @ManyToOne
    @JoinColumn(name="family_member_id_fk", nullable = true)
    private FamilyMember familyMember;
}
