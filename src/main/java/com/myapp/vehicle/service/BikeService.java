package com.myapp.vehicle.service;

//import org.springframework.web.bind.annotation.*;
import java.util.List;

//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.vehicle.Entity.Bike;
import com.myapp.vehicle.dao.BikeDao;

@Service
public class BikeService {
	@Autowired
	BikeDao bikeDao;
	public String addBike(Bike b) {
		return bikeDao.addBike(b);
	}
	public Bike getBike(int bikeNo) {
		return bikeDao.getBike(bikeNo);
	}
	public String addBikes(List<Bike> b) {
		return bikeDao.addBikes(b);
	}
	public List<Bike> getBikes() {
		return bikeDao.getBikes();
	}
	public String delBike(int bikeNo) {
		return bikeDao.delBike(bikeNo);
	}
	public String upBike(Bike b) {
		return bikeDao.upBike(b);
	}
	public String deleteBike() {
		return bikeDao.deleteBike();
	}
	public List<String> getBrand() {
		List<Bike> li=bikeDao.getBikes();
		return li.stream().map(x->x.getBrand()).toList();
	}
	public List<Bike> getByBike(String brand) {
		List<Bike> li=bikeDao.getBikes();
		return li.stream().filter(x->x.getBrand().equalsIgnoreCase(brand)).toList();
	}
}

