package fr.visiplus.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InternalController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}

}
