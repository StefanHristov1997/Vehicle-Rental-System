package model.entity;

import model.enums.VehicleType;

public class Car extends Vehicle {

    private int safetyRating;

    private final static double PRICE_PER_DAY = 20;

    public Car(Long id, VehicleType type, String model, String brand, double value, double pricePerDay) {
        super(id, type, model, brand, value, PRICE_PER_DAY);
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    private void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }
}
