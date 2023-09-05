package com.myapp.vehicle.service;

//import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.myapp.vehicle.Entity.Car;
import com.myapp.vehicle.dao.CarDao;

@Service
public class CarService {
	//static Logger log=Logger.getLogger(CarService.class);
	@Autowired
	CarDao carDao;
	public String addCar(Car c) {
		return carDao.addCar(c);
	}
	public Car getCar(int carNo) {
		return carDao.getCar(carNo);
	}
	public String addCars(List<Car> c) {
		return carDao.addCars(c);
	}
	public List<Car> getCars() {
		//PropertyConfigurator.configure("log.properties");
		//log.info(carDao.getCars());
		return carDao.getCars();
	}
	public String delCar(int carNo) {
		return carDao.delCar(carNo);
	}
	public String upCar(Car c) {
		return carDao.upCar(c);
	}
	public String deleteCar() {
		return carDao.deleteCar();
	}
	public List<String> getBrand() {
		List<Car> li=carDao.getCars();
		return li.stream().map(x->x.getBrand()).toList();
	}
	public List<Car> getByCar(String brand) {
		List<Car> li=carDao.getCars();
		return li.stream().filter(x->x.getBrand().equalsIgnoreCase(brand)).toList();
	}
}
