package com.example.eats.entity;

import jakarta.persistence.*;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;
    private String typeName;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Long getTypeId() { return typeId; }
    public void setTypeId(Long typeId) { this.typeId = typeId; }
    public String getTypeName() { return typeName; }
    public void setTypeName(String typeName) { this.typeName = typeName; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
}
