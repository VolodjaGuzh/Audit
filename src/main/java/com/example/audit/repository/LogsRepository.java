package com.example.audit.repository;

import com.example.audit.core.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogsRepository extends JpaRepository<Log, Long> {
}
