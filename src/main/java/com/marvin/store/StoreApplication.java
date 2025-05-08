package com.marvin.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		// var orderService = context.getBean(OrderService.class);
		// orderService.placeOrder();
		var userService = context.getBean(UserService.class);
		userService.registerUser(new User(1L, "marvin@gmail.com", "12345", "mosh"));
		userService.registerUser(new User(1L, "marvin@gmail.com", "12345", "mosh"));
	}

}
