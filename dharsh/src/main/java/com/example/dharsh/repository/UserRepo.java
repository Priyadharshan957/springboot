package com.example.dharsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dharsh.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}
