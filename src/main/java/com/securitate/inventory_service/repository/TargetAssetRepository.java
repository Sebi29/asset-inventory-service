package com.securitate.inventory_service.repository;

import com.securitate.inventory_service.entity.TargetAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TargetAssetRepository extends JpaRepository<TargetAsset, Long> {

   @Query("SELECT COUNT(t) > 0 FROM TargetAsset t WHERE t.ipOrDomain = :ipOrDomain")
    boolean existsByIpOrDomain(@Param("ipOrDomain") String ipOrDomain);
}
