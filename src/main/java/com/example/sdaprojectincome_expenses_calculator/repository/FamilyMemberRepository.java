package com.example.sdaprojectincome_expenses_calculator.repository;

import com.example.sdaprojectincome_expenses_calculator.model.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Long> {


}
