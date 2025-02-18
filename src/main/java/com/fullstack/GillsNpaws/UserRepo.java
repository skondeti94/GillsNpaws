package com.fullstack.GillsNpaws;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User,String> {
    List<User> findByEmail(String email);
}
