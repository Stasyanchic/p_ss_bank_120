package com.bank.publicinfo.controller;

import com.bank.publicinfo.dto.BranchDto;
import com.bank.publicinfo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/branch")
public class BranchController {


    private final BranchService branchService;

    @Autowired
    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @GetMapping("/create")
    public ResponseEntity<String> createBranch(@RequestParam("address") String address, @RequestParam("city") String city) {
        BranchDto branchDto = new BranchDto();
        branchDto.setAddress(address);
        branchDto.setCity(city);
        branchService.create(branchDto);
        return ResponseEntity.ok("Creation endpoint");
    }
}
