package com.myapp.vehicle.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.myapp.vehicle.Entity.Car;
import com.myapp.vehicle.service.CarService;

@RestController
@RequestMapping(value = "/car")
public class CarController {
	//static Logger log=Logger.getLogger(CarController.class);
	@Autowired
	CarService carSer;

	@PostMapping(value = "/add")
	public String addCar(@RequestBody Car c) {
		return carSer.addCar(c);
	}

	@GetMapping(value = "/check/{carNo}")
	public Car getCar(@PathVariable int carNo) {
		return carSer.getCar(carNo);
	}

	@PostMapping(value = "/postlist")
	public String addCars(@RequestBody List<Car> c) {
		return carSer.addCars(c);
	}

	@GetMapping(value={"/checks"})
	public List<Car> getCars() {
		//PropertyConfigurator.configure("log.properties");
		//log.info(carSer.getCars());
		return carSer.getCars();
	}
		@DeleteMapping(value="/del/{carNo}")
		public String delCar(@PathVariable int carNo) {
			return carSer.delCar(carNo);
		}
		@PutMapping(value="update")
		public String upCar(@RequestBody Car c) {
			
			return carSer.upCar(c);
		}
		@DeleteMapping(value="/delete")
		public String deleteCar() {
			return carSer.deleteCar();
		}
		@GetMapping(value="/getBrand")
		public List<String> getBrand()
		{
			return carSer.getBrand();
		}
		@GetMapping(value="/getCarByBrand/{brand}")
		public List<Car> getByCar(@PathVariable String brand){
			return carSer.getByCar(brand);
		}
		}


