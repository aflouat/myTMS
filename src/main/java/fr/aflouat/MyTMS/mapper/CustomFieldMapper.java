package fr.aflouat.MyTMS.mapper;

//CustomFieldMapper.java
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.aflouat.MyTMS.dto.CustomFieldDTO;
import fr.aflouat.MyTMS.model.CustomField;

@Mapper(componentModel = "spring")
public interface CustomFieldMapper {

 CustomFieldMapper INSTANCE = Mappers.getMapper(CustomFieldMapper.class);

 @Mapping(target = "id", ignore = false) // Ignore mapping of 'id' from DTO to entity
 CustomField dtoToEntity(CustomFieldDTO customFieldDTO);

 CustomFieldDTO entityToDto(CustomField customField);
}
