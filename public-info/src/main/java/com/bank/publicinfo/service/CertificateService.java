package com.bank.publicinfo.service;

import com.bank.publicinfo.dto.CertificateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CertificateService {
    CertificateDto create(CertificateDto certificateDto);
    CertificateDto update(Long id, CertificateDto certificateDto);
    void delete(Long id);
    CertificateDto getById(Long id);
    List<CertificateDto> getByBankId(Long bankId);
}
