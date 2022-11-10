package com.TouristWebsite.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TouristWebsite.model.Tourist;
import com.TouristWebsite.repository.TouristRepo;


@Service
public class TouristService {



	@Autowired
	private TouristRepo touristRepo;
	
	
	public List<Tourist> getAllTourist() {
		
		
		return touristRepo.findAll();
	}


	public Tourist saveTourist(Tourist tourist) {
		return touristRepo.save(tourist);
	}

	
	
	
	

}
