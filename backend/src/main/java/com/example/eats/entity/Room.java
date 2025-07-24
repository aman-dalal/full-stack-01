package com.example.eats.entity;

import jakarta.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;
    private String roomName;

    @ManyToOne
    @JoinColumn(name = "floor_id")
    private Floor floor;

    public Long getRoomId() { return roomId; }
    public void setRoomId(Long roomId) { this.roomId = roomId; }
    public String getRoomName() { return roomName; }
    public void setRoomName(String roomName) { this.roomName = roomName; }
    public Floor getFloor() { return floor; }
    public void setFloor(Floor floor) { this.floor = floor; }
}
