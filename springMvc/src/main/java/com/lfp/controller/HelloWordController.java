package com.lfp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {

	@RequestMapping(value="/hello.do")
	public String hello(){
		
		return "hello";
	}
}
