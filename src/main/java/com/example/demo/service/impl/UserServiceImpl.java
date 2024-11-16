package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }
}
