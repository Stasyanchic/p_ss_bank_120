package com.bank.publicinfo.service;

import com.bank.publicinfo.dto.AuditDto;

import java.time.LocalDateTime;
import java.util.List;

public interface AuditService {
    void log(String entityType, String operationType, String entityJson);
    List<AuditDto> getByOperationType(String operationType);
    List<AuditDto> getByPeriod(LocalDateTime start, LocalDateTime end);
}
