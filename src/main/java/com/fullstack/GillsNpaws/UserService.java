package com.fullstack.GillsNpaws;

import java.util.List;

public interface UserService {

    void saveDetails(User user);

    List<User> findByEmail(String email);

    List<User> findAll();
}
