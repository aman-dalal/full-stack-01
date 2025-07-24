package com.example.eats.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ServicingLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    @ManyToOne
    @JoinColumn(name = "asset_id")
    private Asset asset;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private ScheduledTask schedule;

    private String description;
    private LocalDate serviceDate;
    private Double cost;
    private String documentPath;

    // getters and setters
    public Long getLogId() { return logId; }
    public void setLogId(Long logId) { this.logId = logId; }
    public Asset getAsset() { return asset; }
    public void setAsset(Asset asset) { this.asset = asset; }
    public Room getRoom() { return room; }
    public void setRoom(Room room) { this.room = room; }
    public Worker getWorker() { return worker; }
    public void setWorker(Worker worker) { this.worker = worker; }
    public ScheduledTask getSchedule() { return schedule; }
    public void setSchedule(ScheduledTask schedule) { this.schedule = schedule; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDate getServiceDate() { return serviceDate; }
    public void setServiceDate(LocalDate serviceDate) { this.serviceDate = serviceDate; }
    public Double getCost() { return cost; }
    public void setCost(Double cost) { this.cost = cost; }
    public String getDocumentPath() { return documentPath; }
    public void setDocumentPath(String documentPath) { this.documentPath = documentPath; }
}
