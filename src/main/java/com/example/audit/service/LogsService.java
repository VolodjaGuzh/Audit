package com.example.audit.service;

import com.example.audit.core.dto.LogDto;

public interface LogsService {
    void createLog(LogDto logDto);
}
