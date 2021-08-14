package com.example.sdaprojectincome_expenses_calculator.repository;

import com.example.sdaprojectincome_expenses_calculator.model.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Long> {


//    @Query("SELECT name FROM family_member")
//    List<FamilyMember> findFamilyMembers();

//    FamilyMember findFamilyMemberById(Long id);



}
