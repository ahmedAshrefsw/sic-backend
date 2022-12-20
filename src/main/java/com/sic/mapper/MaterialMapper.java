package com.sic.mapper;

import com.sic.dto.CreateMaterialDto;
import com.sic.model.Material;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MaterialMapper {
    Material createMaterialDtoToMaterial(CreateMaterialDto materialDto);

}
