package com.myapp.vehicle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.vehicle.Entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{

}

