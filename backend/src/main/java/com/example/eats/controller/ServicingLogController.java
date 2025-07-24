package com.example.eats.controller;

import com.example.eats.entity.ServicingLog;
import com.example.eats.repo.ServicingLogRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class ServicingLogController {
    private final ServicingLogRepository repo;
    public ServicingLogController(ServicingLogRepository repo) { this.repo = repo; }

    @GetMapping
    public List<ServicingLog> findAll() { return repo.findAll(); }

    @PostMapping
    public ServicingLog create(@RequestBody ServicingLog log) { return repo.save(log); }
}
