package com.example.sdaprojectincome_expenses_calculator.controller;

import com.example.sdaprojectincome_expenses_calculator.model.FamilyMember;
import com.example.sdaprojectincome_expenses_calculator.service.FamilyMemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping(path = "/api/v1/familyMember")
public class FamilyMemberController {

    private final FamilyMemberService familyMemberService;

    @GetMapping()
    public ResponseEntity<List<FamilyMember>> getAllFamilyMembers() {
        List<FamilyMember> familyMembers = familyMemberService.getAllFamilyMembers();
        return new ResponseEntity<>(familyMembers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FamilyMember> getFamilyMemberById(@PathVariable("id") Long id) {
        FamilyMember familyMemberById = familyMemberService.findFamilyMemberById(id);
        return new ResponseEntity<>(familyMemberById, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<FamilyMember> createFamilyMember(@RequestBody FamilyMember familyMember) {
        FamilyMember newFamilyMember = familyMemberService.addFamilyMember(familyMember);
        return new ResponseEntity<>(newFamilyMember, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<FamilyMember> updateFamilyMember(@RequestBody FamilyMember familyMember) {
        FamilyMember updateFamilyMember = familyMemberService.updateFamilyMember(familyMember);
        return new ResponseEntity<>(updateFamilyMember, HttpStatus.OK);
    }

//    @PutMapping("{id}")
//    public ResponseEntity<Void> updateFamilyMember1(@PathVariable Long Id, @RequestParam("name") String name) {
//        FamilyMember updatedfamilyMember = familyMemberService.updateFamilyMemberById(Id);
//        updatedfamilyMember.setName(name);
//        familyMemberService.
//        return new ResponseEntity<>(HttpStatus.OK);
//    }


    @Transactional
    @DeleteMapping(path = "{familyMemberId}")
    public ResponseEntity<?> deleteFamilyMember(@PathVariable("familyMemberId") Long familyMemberId) {
        familyMemberService.deleteFamilyMember(familyMemberId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
