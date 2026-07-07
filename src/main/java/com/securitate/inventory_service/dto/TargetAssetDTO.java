package com.securitate.inventory_service.dto;

public class TargetAssetDTO {

    private String name;
    private String ipOrDomain;
    private String assetType;

    public TargetAssetDTO(){
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getIpOrDomain(){
        return ipOrDomain;
    }

    public void setIpOrDomain(String ipOrDomain){
        this.ipOrDomain=ipOrDomain;
    }

    public String getAssetType(){
        return assetType;
    }

    public void setAssetType(String assetType){
        this.assetType=assetType;
    }
}
