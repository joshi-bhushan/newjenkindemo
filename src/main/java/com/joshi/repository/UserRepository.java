package com.joshi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joshi.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	

}
