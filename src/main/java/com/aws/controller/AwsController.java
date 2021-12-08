package com.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.entity.User;
import com.aws.repo.UserRepository;

@RestController
@RequestMapping("/api")
public class AwsController {
	@Autowired
	UserRepository userrepo;
	
	@GetMapping("/test")
	public String test()
	{
		return "Test Check";
		
	}
	@PostMapping("/register")
	public User createUser(@RequestBody User user)
	{
		userrepo.save(user);
		return user;
		
	}
	@GetMapping("/allUser")
	public List<User> getAllUser()
	{
		List<User> u1=userrepo.findAll();
		return u1;
		
	}
}
