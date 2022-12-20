package com.sic.controller;


import com.sic.dto.CreateMaterialDto;
import com.sic.mapper.MaterialMapper;
import com.sic.model.Material;
import com.sic.service.MaterialService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/material")
public class MaterialController {

    @Autowired
    MaterialService service;

    @Autowired
    MaterialMapper mapper;

    @GetMapping()
    public String getAllMaterials(){
        log.info("Enters getAllMaterials api ");
        return "hello";
    }

    @PostMapping
    public ResponseEntity<Material> createMaterial(@RequestBody @Valid CreateMaterialDto dto){
        log.info("enters create material controller");
        log.info("material name : " + dto.getName());
        log.info("material link : " + dto.getLink());
        Material material = mapper.createMaterialDtoToMaterial(dto);
        Material createdMaterial = service.createMaterial(material);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMaterial);
    }
}
