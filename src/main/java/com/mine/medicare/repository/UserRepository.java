package com.mine.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mine.medicare.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
   
}
