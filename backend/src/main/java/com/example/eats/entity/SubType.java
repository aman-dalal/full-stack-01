package com.example.eats.entity;

import jakarta.persistence.*;

@Entity
public class SubType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subtypeId;
    private String subtypeName;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    public Long getSubtypeId() { return subtypeId; }
    public void setSubtypeId(Long subtypeId) { this.subtypeId = subtypeId; }
    public String getSubtypeName() { return subtypeName; }
    public void setSubtypeName(String subtypeName) { this.subtypeName = subtypeName; }
    public Type getType() { return type; }
    public void setType(Type type) { this.type = type; }
}
