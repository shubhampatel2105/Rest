package com.sp.springmvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.springmvc.domain.Message;

@RestController
public class ExampleRestController {

	@RequestMapping("/")
	public String welcome(){
		return "Welcome to Rest Example";
	}
	
	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player){
		
		Message msg=new Message(player, "Hello "+player);
		return msg;
	}
}
