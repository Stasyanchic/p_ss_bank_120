package com.bank.publicinfo.service;

import com.bank.publicinfo.dto.AtmDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AtmService {
    AtmDto create(AtmDto atmDto);
    AtmDto update(Long id, AtmDto atmDto);
    void delete(Long id);
    AtmDto getById(Long id);
    List<AtmDto> getAll();
    List<AtmDto> get24hAtms();


}
