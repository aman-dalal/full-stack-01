package com.example.eats.controller;

import com.example.eats.entity.Asset;
import com.example.eats.repo.AssetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assets")
public class AssetController {
    private final AssetRepository repo;
    public AssetController(AssetRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Asset> findAll() { return repo.findAll(); }

    @PostMapping
    public Asset create(@RequestBody Asset asset) { return repo.save(asset); }
}
