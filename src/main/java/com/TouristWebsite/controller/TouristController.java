package com.TouristWebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TouristWebsite.model.Tourist;
import com.TouristWebsite.service.*;
@RestController
//@CrossOrigin("*")
@RequestMapping("/")
public class TouristController {
	@Autowired
	private TouristService touristService;
	
	@PostMapping("/User")
	public Tourist saveTourist(@RequestBody Tourist tourist) {
			return  touristService.saveTourist(tourist);
			}
	@GetMapping("/User")
	public List<Tourist>getAllTourist(){
		return touristService.getAllTourist();
	}
	

}
