package model.entity;

import model.enums.VehicleType;

public class Motorcycle extends Vehicle {

    private final static double PRICE_PER_DAY = 50;

    public Motorcycle(Long id, VehicleType type, String model, String brand, double value, double pricePerDay) {
        super(id, type, model, brand, value, PRICE_PER_DAY);
    }
}
