package com.example.eats.controller;

import com.example.eats.entity.ScheduledTask;
import com.example.eats.repo.ScheduledTaskRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class ScheduledTaskController {
    private final ScheduledTaskRepository repo;
    public ScheduledTaskController(ScheduledTaskRepository repo) { this.repo = repo; }

    @GetMapping
    public List<ScheduledTask> findAll() { return repo.findAll(); }

    @PostMapping
    public ScheduledTask create(@RequestBody ScheduledTask task) { return repo.save(task); }
}
