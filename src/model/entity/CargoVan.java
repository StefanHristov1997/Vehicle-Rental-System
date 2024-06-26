package model.entity;

import model.enums.VehicleType;

public class CargoVan extends Vehicle {

    private final static double RENTAL_PRICE_PER_DAY = 50;

    private final static double INSURANCE_COEFFICIENT = 0.0003;
    private final static double INSURANCE_COEFFICIENT_WITH_DISCOUNT = 0.15;

    public CargoVan(Long id, VehicleType type, String model, String brand, double value) {
        super(id,
                type,
                model,
                brand,
                value,
                RENTAL_PRICE_PER_DAY,
                RENTAL_PRICE_PER_DAY - 10,
                value * INSURANCE_COEFFICIENT,
                (value * INSURANCE_COEFFICIENT) * INSURANCE_COEFFICIENT_WITH_DISCOUNT);
    }
}
