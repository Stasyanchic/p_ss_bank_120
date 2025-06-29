package com.bank.publicinfo.mapper;

import com.bank.publicinfo.dto.BankDetailsDto;
import com.bank.publicinfo.model.BankDetails;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",  //Позволяет внедрять маппер как Spring-бин через @Autowired
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, //Если в DTO поле null, то при обновлении сущности это поле игнорируется (не перезаписывается в null
        unmappedTargetPolicy = ReportingPolicy.IGNORE) //Игнорирует предупреждения о несоответствии полей (если в DTO и сущности есть разные поля
public interface BankDetailsMapper {

    @Mapping(target = "id", ignore = true)
    BankDetails ToEntity(BankDetailsDto bankDetailsDto);

    BankDetailsDto toDto(BankDetails entity);

    //Обновляет только не-null поля из DTO в существующей сущности.
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(BankDetailsDto dto, @MappingTarget BankDetails entity);

    // Для работы с коллекциями
    List<BankDetailsDto> toDtoList(List<BankDetails> entities);


}
