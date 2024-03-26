/**
 * from youtube: https://www.youtube.com/watch?v=Jl9OKQ92SJU
 * chapter on spring security
 */
package com.jah.secureapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 */
@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
}
