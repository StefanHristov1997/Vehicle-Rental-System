package model.entity;

import model.enums.VehicleType;

public class Motorcycle extends Vehicle {

    private final static double RENTAL_PRICE_PER_DAY = 50;

    public Motorcycle(Long id, VehicleType type, String model, String brand, double value) {
        super(id, type, model, brand, value, RENTAL_PRICE_PER_DAY, value * 0.02);
    }
}
