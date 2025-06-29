package com.bank.publicinfo.mapper;

import com.bank.publicinfo.dto.AuditDto;
import com.bank.publicinfo.model.Audit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring ",
        nullValuePropertyMappingStrategy =  NullValuePropertyMappingStrategy.IGNORE)
public interface AuditMapper {

    @Mapping(target = "id", ignore = true)
    Audit toEntity(AuditDto auditDto);

    AuditDto toDto(Audit audit);

    List<AuditDto> toDtoList(List<Audit> entities);
}
