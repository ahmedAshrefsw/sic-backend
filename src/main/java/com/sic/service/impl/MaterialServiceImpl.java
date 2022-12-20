package com.sic.service.impl;

import com.sic.model.Material;
import com.sic.repository.MaterialRepository;
import com.sic.service.MaterialService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    MaterialRepository repository;
    @Override
    public Material createMaterial(Material material) {
        log.info("create material service method");

        return repository.save(material);
    }
}
