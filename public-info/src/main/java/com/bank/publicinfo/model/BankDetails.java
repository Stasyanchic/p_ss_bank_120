package com.bank.publicinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "bank_details", schema = "public_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "bik", unique = true)
    private Long bik;

    @Column(name = "inn", unique = true)
    private Long inn;

    @Column(name = "kpp", unique = true)
    private Long kpp;

    @Column(name = "cor_account", unique = true)
    private Integer corAccount;

    @Column(name = "city", length = 180)
    private String city;

    @Column(name = "joint_stock_company", length = 15)
    private String jointStockCompany;

    @Column(name = "name", length = 80)
    private String name;

    @OneToMany(mappedBy = "bankDetails", cascade = CascadeType.ALL)
    private List<License> licenses;

    @OneToMany(mappedBy = "bankDetails", cascade = CascadeType.ALL)
    private List<Certificate> certificates;
}
