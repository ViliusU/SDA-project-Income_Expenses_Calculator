package com.example.sdaprojectincome_expenses_calculator.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name = "family_member")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FamilyMember implements Serializable {

    @Id
    @Column(nullable = true, insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}