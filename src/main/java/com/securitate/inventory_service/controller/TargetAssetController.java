package com.securitate.inventory_service.controller;

import com.securitate.inventory_service.entity.TargetAsset;
import com.securitate.inventory_service.service.TargetAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    public TargetAsset createAsset(@RequestBody TargetAsset asset) {
        return service.saveAsset(asset);
    }

}
