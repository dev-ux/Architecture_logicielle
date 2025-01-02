package fr.visiplus.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.visiplus.service.model.Information;
import fr.visiplus.service.service.InformationService;

@RestController
public class EternalController {
	
	@Autowired
	private InformationService informationService;
	
	@GetMapping("/info")
	public Information getInformation() {
		return informationService.getInformation();
		}

}
