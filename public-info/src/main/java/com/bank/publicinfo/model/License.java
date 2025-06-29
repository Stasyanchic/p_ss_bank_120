package com.bank.publicinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "license", schema = "public_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "photo")
    private byte[] photo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bank_details_id")
    private BankDetails bankDetails;
}
