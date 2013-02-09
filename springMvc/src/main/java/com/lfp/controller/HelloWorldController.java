package com.lfp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/hello.do", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name, Model model) {
		model.addAttribute("message", "hello" + name + "!");
		return "hello";
	}
}
