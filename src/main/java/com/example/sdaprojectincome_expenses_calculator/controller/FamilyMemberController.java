package com.example.sdaprojectincome_expenses_calculator.controller;

import com.example.sdaprojectincome_expenses_calculator.model.FamilyMember;
import com.example.sdaprojectincome_expenses_calculator.service.FamilyMemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/familyMember")
public class FamilyMemberController {

    private final FamilyMemberService familyMemberService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<FamilyMember>> getAllFamilyMembers() {
        List<FamilyMember> familyMembers = familyMemberService.getAllFamilyMembers();
        return new ResponseEntity<>(familyMembers, HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<FamilyMember> addFamilyMember(@RequestBody FamilyMember familyMember) {
        FamilyMember newFamilyMember = familyMemberService.addFamilyMember(familyMember);
        return new ResponseEntity<>(newFamilyMember, HttpStatus.CREATED);
    }

    @PutMapping(path = "/update")
    public ResponseEntity<FamilyMember> updateFamilyMember(@RequestBody FamilyMember familyMember) {
        FamilyMember updateFamilyMember = familyMemberService.updateFamilyMember(familyMember);
        return new ResponseEntity<>(updateFamilyMember, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping(path = "delete/{familyMemberId}")
    public ResponseEntity<?> deleteFamilyMember(@PathVariable("familyMemberId") Long familyMemberId) {
        familyMemberService.deleteFamilyMember(familyMemberId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
