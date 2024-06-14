package model.entity;

import model.enums.VehicleType;

public class Car extends Vehicle {

    private int safetyRating;

    private final static double RENTAL_PRICE_PER_DAY = 20;

    public Car(Long id, VehicleType type, String model, String brand, double value,
               double rentalPricePerDay, double insurancePricePerDay) {
        super(id, type, model, brand, value, RENTAL_PRICE_PER_DAY, value * 0.01);
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    private void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }
}
