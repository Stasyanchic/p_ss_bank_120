package com.bank.publicinfo.service;

import com.bank.publicinfo.dto.BranchDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BranchService {
    BranchDto create(BranchDto branchDto);
    BranchDto update (Long id, BranchDto branchDto);
    void delete (Long id);
    List<BranchDto> getAll();
    List<BranchDto> getByCity(String city);

}
