package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// expose "/" that return "Hello World"
	
	@RequestMapping("/hello")
   	 String helloWorld() {
        return "5. please visit my website learning-ocean.com";
    }
}
