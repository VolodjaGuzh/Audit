package com.example.audit.service.impl;

import com.example.audit.core.entity.User;
import com.example.audit.repository.UsersRepository;
import com.example.audit.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {
    private final UsersRepository usersRepository;
    @Override
    public Optional<User> findByUsername(String username) {
        return usersRepository.findUserByUsername(username);
    }

    @Override
    public void saveNewUser(User user) {
        usersRepository.save(user);
    }
}
