package com.myapp.vehicle.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.vehicle.Entity.Bike;
import com.myapp.vehicle.service.BikeService;

@RestController
@RequestMapping(value = "/bike")
public class BikeController {
	@Autowired
	BikeService bikeSer;

	@PostMapping(value = "/add")
	public String addBike(@RequestBody Bike b) {
		return bikeSer.addBike(b);
	}

	@GetMapping(value = "/check/{bikeNo}")
	public Bike getBike(@PathVariable int bikeNo) {
		return bikeSer.getBike(bikeNo);
	}

	@PostMapping(value = "/postlist")
	public String addBikes(@RequestBody List<Bike> b) {
		return bikeSer.addBikes(b);
	}

	@GetMapping(value={"/checks"})
	public List<Bike> getBikes() {
		return bikeSer.getBikes();
	}
		@DeleteMapping(value="/del/{carNo}")
		public String delBike(@PathVariable int bikeNo) {
			return bikeSer.delBike(bikeNo);
		}
		@PutMapping(value="update")
		public String upBike(@RequestBody Bike b) {
			return bikeSer.upBike(b);
		}
		@DeleteMapping(value="/delete")
		public String deleteBike() {
			return bikeSer.deleteBike();
		}
		@GetMapping(value="/getBrand")
		public List<String> getBrand()
		{
			return bikeSer.getBrand();
		}
		@GetMapping(value="/getBikeBrand/{brand}")
		public List<Bike> getByBike(@PathVariable String brand){
			return bikeSer.getByBike(brand);
		}
		}




