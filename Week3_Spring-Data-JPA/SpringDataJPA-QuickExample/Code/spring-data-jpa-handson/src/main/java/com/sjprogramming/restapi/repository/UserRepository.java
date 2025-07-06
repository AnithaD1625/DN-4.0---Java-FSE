package com.sjprogramming.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjprogramming.restapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
