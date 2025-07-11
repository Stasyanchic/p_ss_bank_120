package com.bank.publicinfo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LicenseDto {
    private Long id;
    private byte[] photo;
    private Long bankDetailsId;
}