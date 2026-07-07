package com.securitate.inventory_service.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="target_asset")
public class TargetAsset {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(name="ip_or_domain", nullable=false)
    private String ipOrDomain;

    @Column(name="asset_type")
    private String assetType;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    public TargetAsset() {
        this.createdAt = LocalDateTime.now();
    }
    public TargetAsset(String name, String ipOrDomain, String assetType) {
        this.name = name;
        this.ipOrDomain = ipOrDomain;
        this.assetType = assetType;
        this.createdAt = LocalDateTime.now();

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getIpOrDomain() {
        return ipOrDomain;
    }
    public void setIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
    }
    public String getAssetType() {
        return assetType;
    }
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
