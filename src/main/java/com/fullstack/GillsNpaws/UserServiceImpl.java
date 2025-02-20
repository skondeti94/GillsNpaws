package com.fullstack.GillsNpaws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public void saveDetails(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
