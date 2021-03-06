package com.joshi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joshi.entities.User;
import com.joshi.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userRepo;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user)
	{
		return userRepo.save(user);
		
	}
	
	@GetMapping("/findAll")
	public List<User> findAll()
	{
		List<User> list = userRepo.findAll();
		return list;
	}

}
