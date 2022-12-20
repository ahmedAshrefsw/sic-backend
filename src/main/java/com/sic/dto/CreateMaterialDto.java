package com.sic.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateMaterialDto {
    @NotBlank
    private String name;
    @NotBlank
    private String link;

}
