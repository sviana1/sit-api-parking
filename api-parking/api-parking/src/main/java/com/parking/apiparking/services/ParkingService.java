package com.parking.apiparking.services;

import com.parking.apiparking.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    private List<Car> parkingLot;

    public ParkingService(){
        this.parkingLot = new ArrayList<>();
    }

    //Como usuario quiero poder ver la lista de todos los autos estacionados en el parqueo,
    //para poder tener una vision general del estado actual del estacionamiento.
    public List<Car> getAllCars(){
        return this.parkingLot;
    }

    //Quiero poder agregar un auto al parqueo para poder estacionar mi vehiculo
    public void addCar(Car car){
        this.parkingLot.add(car);
    }

}
