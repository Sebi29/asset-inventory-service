package com.securitate.inventory_service.service;

import com.securitate.inventory_service.entity.TargetAsset;
import com.securitate.inventory_service.repository.TargetAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TargetAssetService {

    private final TargetAssetRepository repository;

    @Autowired
    public TargetAssetService(TargetAssetRepository repository){
        this.repository=repository;
    }

    public List<TargetAsset> getAllAssets() {
        return repository.findAll();
    }

    public TargetAsset saveAsset(TargetAsset asset) {
        return repository.save(asset);
    }
}
