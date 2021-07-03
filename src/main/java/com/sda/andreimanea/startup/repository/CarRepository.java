package com.sda.andreimanea.startup.repository;

import com.sda.andreimanea.startup.model.car.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
}
