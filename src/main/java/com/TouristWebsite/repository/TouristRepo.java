package com.TouristWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TouristWebsite.model.Tourist;

@Repository
public interface TouristRepo extends JpaRepository<Tourist, Integer>{
	

}
