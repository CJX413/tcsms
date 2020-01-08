package com.example.tcsms.Dao;

import com.example.tcsms.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
