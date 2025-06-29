package com.bank.publicinfo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditDto {
    private String entityType;
    private String operationType;
    private String createdBy;
    private String modifiedBy;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String newEntityJson;
    private String entityJson;
}