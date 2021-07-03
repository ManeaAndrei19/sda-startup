package com.sda.andreimanea.startup.service;

import com.sda.andreimanea.startup.service.dto.CarDTO;

public interface CarService {
    /**
     * Create a new Car for the given CarDTO.
     *
     * @param carDTO, details of the new Car.
     * @return the id of the newly created Car.
     */
    Long addCar(CarDTO carDTO);
}
