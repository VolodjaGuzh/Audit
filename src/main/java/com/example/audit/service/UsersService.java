package com.example.audit.service;

import com.example.audit.core.entity.User;

import java.util.Optional;

public interface UsersService {
    Optional<User> findByUsername(String username);
    void saveNewUser(User user);
}
