package com.sunny.secureapp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunny.secureapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String user);
}
