package com.bank.publicinfo.repository;

import com.bank.publicinfo.model.Atm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtmRepository extends JpaRepository<Atm, Long> {

}
