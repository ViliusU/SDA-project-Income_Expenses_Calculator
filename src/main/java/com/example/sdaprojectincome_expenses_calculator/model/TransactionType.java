package com.example.sdaprojectincome_expenses_calculator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "transaction_type")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class TransactionType implements Serializable {

    @Id
    @Column(nullable = true, insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}


