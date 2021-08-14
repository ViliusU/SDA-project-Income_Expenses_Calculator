package com.example.sdaprojectincome_expenses_calculator.service;

import com.example.sdaprojectincome_expenses_calculator.model.FamilyMember;
import com.example.sdaprojectincome_expenses_calculator.repository.FamilyMemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class FamilyMemberService {
    private final FamilyMemberRepository familyMemberRepository;


    public List<FamilyMember> getAllFamilyMembers() {
        return familyMemberRepository.findAll();
    }

    public FamilyMember findFamilyMemberById(Long id) {
        return familyMemberRepository.getById(id);
    }

    public FamilyMember addFamilyMember(FamilyMember familyMember) {
        return familyMemberRepository.save(familyMember);
    }

    public FamilyMember updateFamilyMember(FamilyMember familyMember) {
        return familyMemberRepository.save(familyMember);
    }

//    public FamilyMember updateFamilyMemberById(Long id) {
//        return familyMemberRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//    }

    public void deleteFamilyMember(Long familyMemberId) {
        familyMemberRepository.deleteById(familyMemberId);
    }
}


