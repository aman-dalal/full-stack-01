package com.example.eats.repo;

import com.example.eats.entity.ScheduledTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduledTaskRepository extends JpaRepository<ScheduledTask, Long> {}
