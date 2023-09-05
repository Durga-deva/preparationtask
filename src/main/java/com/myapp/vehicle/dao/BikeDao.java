package com.myapp.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myapp.vehicle.Entity.Bike;
import com.myapp.vehicle.Repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
     BikeRepository bikeRepo;
	public String addBike(Bike b) {
		bikeRepo.save(b);
		return "Successfully added";
	}
	
	public Bike getBike(int bikeNo) {
		return bikeRepo.findById(bikeNo).get();
		
	}
	public String addBikes(List<Bike> b) {
		 bikeRepo.saveAll(b);
		 return "Successufully created data";
	}
	public List<Bike> getBikes() {
		return bikeRepo.findAll();	
	}
	public String delBike(int bikeNo) {
		 bikeRepo.deleteById(bikeNo);
		 return "Successfully deleted one column";
	}
	public String upBike(Bike b) {
		bikeRepo.save(b);
		return "Successfully update data";
	}
	public String deleteBike() {
		 bikeRepo.deleteAll();
		 return "Delete All the rows";
	}

}

