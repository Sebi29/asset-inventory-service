package com.securitate.inventory_service.repository;

import com.securitate.inventory_service.entity.TargetAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TargetAssetRepository extends JpaRepository<TargetAsset, Long> {
}
