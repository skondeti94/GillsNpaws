package com.fullstack.GillsNpaws;

import java.util.List;

public interface UserService {
    List<User> findByEmail(String email);

    List<User> findAll();
}
