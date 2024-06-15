package model.entity;

import model.enums.VehicleType;

public class Car extends Vehicle {

    private int safetyRating;

    private final static double RENTAL_PRICE_PER_DAY = 20;
    private final static double RENTAL_PRICE_WITH_DISCOUNT_PER_DAY = RENTAL_PRICE_PER_DAY - 5;

    private final static double INSURANCE_COEFFICIENT = 0.0001;
    private final static double INSURANCE_COEFFICIENT_WITH_DISCOUNT = 0.1;


    public Car(Long id, VehicleType type, String model, String brand, double value, int safetyRating) {
        super(id,
                type,
                model,
                brand,
                value,
                RENTAL_PRICE_PER_DAY,
                RENTAL_PRICE_WITH_DISCOUNT_PER_DAY,
                value * INSURANCE_COEFFICIENT,
                (value * INSURANCE_COEFFICIENT) * INSURANCE_COEFFICIENT_WITH_DISCOUNT);
        this.safetyRating = safetyRating;
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    private void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }

}
