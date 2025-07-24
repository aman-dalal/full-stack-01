package com.example.eats.entity;

import jakarta.persistence.*;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workerId;
    private String workerName;
    private String workerContact;

    public Long getWorkerId() { return workerId; }
    public void setWorkerId(Long workerId) { this.workerId = workerId; }
    public String getWorkerName() { return workerName; }
    public void setWorkerName(String workerName) { this.workerName = workerName; }
    public String getWorkerContact() { return workerContact; }
    public void setWorkerContact(String workerContact) { this.workerContact = workerContact; }
}
