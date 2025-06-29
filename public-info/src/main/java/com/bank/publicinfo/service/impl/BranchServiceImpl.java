package com.bank.publicinfo.service.impl;

import com.bank.publicinfo.dto.BranchDto;
import com.bank.publicinfo.model.Branch;
import com.bank.publicinfo.repository.BranchRepository;
import com.bank.publicinfo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BranchServiceImpl implements BranchService {



    private final BranchRepository branchRepository;

    @Autowired
    public BranchServiceImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }


    @Override
    public BranchDto create(BranchDto branchDto) {
        Branch branch = new Branch();
        branchRepository.save(branch);
        return null;
    }

    @Override
    public BranchDto update(Long id, BranchDto branchDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<BranchDto> getAll() {
        return List.of();
    }

    @Override
    public List<BranchDto> getByCity(String city) {
        return List.of();
    }
}
