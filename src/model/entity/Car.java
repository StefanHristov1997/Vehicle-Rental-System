package model.entity;

import model.enums.VehicleType;

public class Car extends Vehicle {

    private int safetyRating;

    private final static double RENTAL_PRICE_PER_DAY = 20;

    private final static double INSURANCE_COEFFICIENT = 0.0001;


    public Car(Long id, VehicleType type, String model, String brand, double value, int safetyRating) {
        super(id, type, model, brand, value, RENTAL_PRICE_PER_DAY, RENTAL_PRICE_PER_DAY - 5, value * INSURANCE_COEFFICIENT);
        this.safetyRating = safetyRating;
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    private void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }

}
