package model.entity;

import model.enums.VehicleType;

public class CargoVan extends Vehicle {

    private final static double RENTAL_PRICE_PER_DAY = 50;


    public CargoVan(Long id, VehicleType type, String model, String brand, double value) {
        super(id, type, model, brand, value, RENTAL_PRICE_PER_DAY, RENTAL_PRICE_PER_DAY - 10,value * 0.0003);
    }

}
