package com.example.eats.entity;

import jakarta.persistence.*;

@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorId;
    private String vendorName;
    private String vendorContact;

    public Long getVendorId() { return vendorId; }
    public void setVendorId(Long vendorId) { this.vendorId = vendorId; }
    public String getVendorName() { return vendorName; }
    public void setVendorName(String vendorName) { this.vendorName = vendorName; }
    public String getVendorContact() { return vendorContact; }
    public void setVendorContact(String vendorContact) { this.vendorContact = vendorContact; }
}
