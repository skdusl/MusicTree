package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller //ctrl + shift + o
public class FrontController {
	
	@RequestMapping(value = "/")
	public String Main() {
		return "index";
	}
}
