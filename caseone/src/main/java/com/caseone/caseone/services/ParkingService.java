package com.caseone.caseone.services;

import java.util.*;
import com.caseone.caseone.entities.Car;
public class ParkingService {
    private List<Car> parkingLot;

    public ParkingService() {
        this.parkingLot = new ArrayList<>();
    }
    //TODO:Como usuario, quiero poder ver la lista de todos los autos estacionados en el
    //parqueo, para poder tener una visión general del estado actual del
    //estacionamiento.
    public List<Car> getAllCars(){
        return parkingLot;
    }
    // TODO:omo usuario, quiero poder buscar un auto por su placa, para poder encontrar
    //rápidamente un vehículo en particular.
    public void addCar(Car car){
        this.parkingLot.add(car);
    }

}
