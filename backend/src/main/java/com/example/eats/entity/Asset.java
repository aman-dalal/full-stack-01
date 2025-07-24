package com.example.eats.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assetId;
    private String assetName;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "subtype_id")
    private SubType subtype;

    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

    private LocalDate warrantyStartDate;
    private LocalDate warrantyEndDate;
    private Double warrantyAmount;
    private String warrantyDocumentPath;
    private LocalDate purchaseDate;
    private Double cost;

    // getters and setters
    public Long getAssetId() { return assetId; }
    public void setAssetId(Long assetId) { this.assetId = assetId; }
    public String getAssetName() { return assetName; }
    public void setAssetName(String assetName) { this.assetName = assetName; }
    public Room getRoom() { return room; }
    public void setRoom(Room room) { this.room = room; }
    public SubType getSubType() { return subtype; }
    public void setSubType(SubType subtype) { this.subtype = subtype; }
    public Vendor getVendor() { return vendor; }
    public void setVendor(Vendor vendor) { this.vendor = vendor; }
    public LocalDate getWarrantyStartDate() { return warrantyStartDate; }
    public void setWarrantyStartDate(LocalDate warrantyStartDate) { this.warrantyStartDate = warrantyStartDate; }
    public LocalDate getWarrantyEndDate() { return warrantyEndDate; }
    public void setWarrantyEndDate(LocalDate warrantyEndDate) { this.warrantyEndDate = warrantyEndDate; }
    public Double getWarrantyAmount() { return warrantyAmount; }
    public void setWarrantyAmount(Double warrantyAmount) { this.warrantyAmount = warrantyAmount; }
    public String getWarrantyDocumentPath() { return warrantyDocumentPath; }
    public void setWarrantyDocumentPath(String warrantyDocumentPath) { this.warrantyDocumentPath = warrantyDocumentPath; }
    public LocalDate getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }
    public Double getCost() { return cost; }
    public void setCost(Double cost) { this.cost = cost; }
}
