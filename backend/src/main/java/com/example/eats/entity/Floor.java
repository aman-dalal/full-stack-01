package com.example.eats.entity;

import jakarta.persistence.*;

@Entity
public class Floor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long floorId;
    private String floorName;

    @ManyToOne
    @JoinColumn(name = "site_id")
    private Site site;

    public Long getFloorId() { return floorId; }
    public void setFloorId(Long floorId) { this.floorId = floorId; }
    public String getFloorName() { return floorName; }
    public void setFloorName(String floorName) { this.floorName = floorName; }
    public Site getSite() { return site; }
    public void setSite(Site site) { this.site = site; }
}
