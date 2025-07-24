package com.example.eats.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ScheduledTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;

    @ManyToOne
    @JoinColumn(name = "asset_id")
    private Asset asset;

    private String description;
    private LocalDate scheduledDate;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "assigned_worker_id")
    private Worker assignedWorker;

    private String status;

    // getters and setters
    public Long getScheduleId() { return scheduleId; }
    public void setScheduleId(Long scheduleId) { this.scheduleId = scheduleId; }
    public Asset getAsset() { return asset; }
    public void setAsset(Asset asset) { this.asset = asset; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDate getScheduledDate() { return scheduledDate; }
    public void setScheduledDate(LocalDate scheduledDate) { this.scheduledDate = scheduledDate; }
    public Room getRoom() { return room; }
    public void setRoom(Room room) { this.room = room; }
    public Worker getAssignedWorker() { return assignedWorker; }
    public void setAssignedWorker(Worker assignedWorker) { this.assignedWorker = assignedWorker; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
