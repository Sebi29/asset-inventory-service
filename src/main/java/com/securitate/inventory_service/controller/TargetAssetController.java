package com.securitate.inventory_service.controller;

import com.securitate.inventory_service.dto.TargetAssetDTO;
import com.securitate.inventory_service.entity.TargetAsset;
import com.securitate.inventory_service.service.TargetAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.lang.annotation.Target;
import java.util.List;

@RestController
@RequestMapping("/api/assets")
public class TargetAssetController {
    private final TargetAssetService service;

    @Autowired
    public TargetAssetController(TargetAssetService service) {
        this.service = service;
    }

    @GetMapping
    public List<TargetAsset> getAllAssets() {
        return service.getAllAssets();
    }

    @PostMapping
    public ResponseEntity<TargetAsset> createAsset(@RequestBody TargetAssetDTO assetDTO) {
        TargetAsset assetForDb=new TargetAsset();
        assetForDb.setName(assetDTO.getName());
        assetForDb.setIpOrDomain(assetDTO.getIpOrDomain());
        assetForDb.setAssetType(assetDTO.getAssetType());

        TargetAsset savedAsset = service.saveAsset(assetForDb);
        return new ResponseEntity<>(savedAsset, HttpStatus.CREATED);
    }
}
