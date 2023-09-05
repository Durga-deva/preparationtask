package com.myapp.vehicle.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.vehicle.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}



