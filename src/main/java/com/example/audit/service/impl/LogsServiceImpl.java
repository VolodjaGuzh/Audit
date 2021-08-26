package com.example.audit.service.impl;

import com.example.audit.core.dto.LogDto;
import com.example.audit.core.entity.Log;
import com.example.audit.core.entity.User;
import com.example.audit.repository.LogsRepository;
import com.example.audit.service.LogsService;
import com.example.audit.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class LogsServiceImpl implements LogsService {
    private final LogsRepository logsRepository;
    private final UsersService usersService;
    @Override
    public void createLog(LogDto logDto) {
        String username = logDto.getUsername();
        if (usersService.findByUsername(username).isEmpty()) {
            usersService.saveNewUser(new User(username));
        }
        Long userId = usersService.findByUsername(username).get().getId();
        Log log = new Log();
        log.setAction(logDto.getAction());
        log.setUserId(userId);
        log.setActionTime(logDto.getActionTime());
        logsRepository.save(log);
    }
}
