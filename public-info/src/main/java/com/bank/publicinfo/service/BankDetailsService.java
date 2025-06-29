package com.bank.publicinfo.service;

import com.bank.publicinfo.dto.BankDetailsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankDetailsService {
    BankDetailsDto create(BankDetailsDto bankDetailsDto);
    BankDetailsDto update(Long id, BankDetailsDto bankDetailsDto);
    void delete(Long id);
    BankDetailsDto getById(Long id);
    List<BankDetailsDto> getAll();
    boolean existsByInn(Long inn);
}
