package fr.visiplus.service.service;

import org.springframework.stereotype.Service;

import fr.visiplus.service.model.Information;

@Service
public class InformationService {
	
	public Information getInformation() {
		
		Information info = new Information("title 1", "description 1");
		return info;
		
	}

}
