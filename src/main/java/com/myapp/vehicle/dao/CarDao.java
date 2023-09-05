package com.myapp.vehicle.dao;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.myapp.vehicle.Entity.Car;
import com.myapp.vehicle.Repository.CarRepository;

@Repository
public class CarDao {
	static Logger log=Logger.getLogger(CarDao.class);
	@Autowired
	CarRepository carRepo;
	public String addCar(Car c) {
		carRepo.save(c);
		return "Successfully added";
	}
	
	public Car getCar(int carNo) {
		return carRepo.findById(carNo).get();
		
	}
	public String addCars(List<Car> c) {
		 carRepo.saveAll(c);
		 return "Successufully created data";
	}
	public List<Car> getCars() {
		PropertyConfigurator.configure("log.properties");
		log.info(carRepo.findAll());
		return carRepo.findAll();	
	}
	public String delCar(int carNo) {
		 carRepo.deleteById(carNo);
		 return "Successfully deleted one column";
	}
	public String upCar(Car c) {
		carRepo.save(c);
		return "Successfully update data";
	}
	public String deleteCar() {
		 carRepo.deleteAll();
		 return "Delete All the rows";
	}

}

