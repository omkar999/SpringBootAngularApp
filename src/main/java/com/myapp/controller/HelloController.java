package com.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.entities.User;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	User user;

	@RequestMapping("{name}")
	public String greetUser(@PathVariable("name") String name) {
		return "Greetings from Spring Boot! " + name.toUpperCase();
	}

	@RequestMapping
	public String greet() {
		return "Greetings from Spring Boot! " + user.getName()
				+ ". This is Bean Config Test using @Configuration for custom bean definitions";
	}

	@CrossOrigin
	@RequestMapping(value = "/angulartest/getuser", headers = "Accept=application/json")
	public List<User> angulartest() {

		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setName("omkar");
		user.setCity("Harrisburgh");

		User user1 = new User();
		user1.setName("John");
		user1.setCity("New York");

		User user2 = new User();
		user2.setName("Ben");
		user2.setCity("California");

		users.add(user);
		users.add(user1);
		users.add(user2);

		return users;
	}

}
