package com.bank.publicinfo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "branch", schema = "public_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address", length = 370)
    private String address;

    @Column(name = "phone_number", unique = true)
    private Long phoneNumber;

    @Column(name = "city", length = 250)
    private String city;

    @Column(name = "start_of_work")
    private LocalTime startOfWork;

    @Column(name = "end_of_work")
    private LocalTime endOfWork;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private List<Atm> atms;
}
