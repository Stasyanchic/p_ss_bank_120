package com.bank.publicinfo.repository;

import com.bank.publicinfo.model.License;
import org.springframework.context.annotation.ReflectiveScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends JpaRepository<License, Long> {
}
