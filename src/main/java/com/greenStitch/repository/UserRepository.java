package com.greenStitch.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.greenStitch.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}