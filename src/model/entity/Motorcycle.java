package model.entity;

import model.enums.VehicleType;

public class Motorcycle extends Vehicle {

    private final static double RENTAL_PRICE_PER_DAY = 15;

    private final static double INSURANCE_COEFFICIENT = 0.0002;

    private final static double INSURANCE_COEFFICIENT_WITH_INC = 0.2;

    public Motorcycle(Long id, VehicleType type, String model, String brand, double value) {
        super(id,
                type,
                model,
                brand,
                value,
                RENTAL_PRICE_PER_DAY,
                RENTAL_PRICE_PER_DAY - 5,
                value * INSURANCE_COEFFICIENT,
                (value * INSURANCE_COEFFICIENT) * INSURANCE_COEFFICIENT_WITH_INC);
    }
}
