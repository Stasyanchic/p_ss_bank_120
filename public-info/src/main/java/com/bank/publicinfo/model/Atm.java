package com.bank.publicinfo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;

@Entity
@Table(name = "atm", schema = "public_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Atm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address", length = 370)
    private String address;

    @NotNull
    @Column(name = "start_of_work", nullable = false)
    private LocalTime startOfWork;

    @NotNull
    @Column(name = "end_of_work", nullable = false)
    private LocalTime endOfWork;

    @Column(name = "all_hours")
    private Boolean allHours;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    private Branch branch;

}
