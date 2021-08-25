package com.example.sdaprojectincome_expenses_calculator.service;

import com.example.sdaprojectincome_expenses_calculator.model.FamilyMember;
import com.example.sdaprojectincome_expenses_calculator.repository.FamilyMemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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

    public void deleteFamilyMember(Long familyMemberId) {
        familyMemberRepository.deleteById(familyMemberId);
    }
}


