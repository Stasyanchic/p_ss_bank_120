package com.bank.publicinfo.service;

import com.bank.publicinfo.dto.LicenseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LicenseService {
    LicenseDto create(LicenseDto licenseDto);
    LicenseDto update(Long id, LicenseDto licenseDto);
    void delete(Long id);
    LicenseDto getById(Long id);
    List<LicenseDto> getByBankId(Long bankId);

}
