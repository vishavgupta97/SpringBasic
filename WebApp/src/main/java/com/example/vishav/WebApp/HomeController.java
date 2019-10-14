package com.example.vishav.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	
	public String home()
	{
		System.out.print("HELLO");
		return "home.jsp";
	
	}

}
