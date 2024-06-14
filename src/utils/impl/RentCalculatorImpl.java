package utils.impl;

import model.entity.Rent;
import model.entity.Vehicle;
import utils.RentCalculator;

public class RentCalculatorImpl implements RentCalculator {

    @Override
    public double calculateRent(Vehicle vehicle, Rent rent) {

        double rentCost = 0;
        int remainingDays = rent.getRentalPeriod() - rent.getActualRentalPeriod();

        switch (vehicle.getType()) {
            case CAR, MOTORCYCLE -> {
                if ((rent.getRentalPeriod() < 7) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    rentCost = rent.getRentalPeriod() * vehicle.getRentalPricePerDay();
                } else if ((rent.getRentalPeriod() > 7) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    rentCost = rent.getRentalPeriod() * vehicle.getRentalPriceWithDiscount();
                } else if (((rent.getRentalPeriod() < 7) && (rent.getRentalPeriod() != rent.getActualRentalPeriod()))) {
                    rentCost = (rent.getActualRentalPeriod() * vehicle.getRentalPricePerDay()) + (remainingDays * (vehicle.getRentalPricePerDay() * 0.5));
                } else if ((rent.getRentalPeriod() > 7) && (rent.getRentalPeriod() != rent.getActualRentalPeriod())) {
                    rentCost = (rent.getActualRentalPeriod() * vehicle.getRentalPriceWithDiscount()) + (remainingDays * (vehicle.getRentalPriceWithDiscount() * 0.5));
                }
            }
            case CARGO_VAN -> {

                if ((rent.getRentalPeriod() < 7) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    rentCost = rent.getRentalPeriod() * vehicle.getRentalPricePerDay();
                } else if ((rent.getRentalPeriod() > 7) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    rentCost = rent.getRentalPeriod() * vehicle.getRentalPriceWithDiscount();
                } else if (((rent.getRentalPeriod() < 7) && (rent.getRentalPeriod() != rent.getActualRentalPeriod()))) {
                    rentCost = (rent.getActualRentalPeriod() * vehicle.getRentalPricePerDay()) + (remainingDays * (vehicle.getRentalPriceWithDiscount() * 0.5));
                } else if ((rent.getRentalPeriod() > 7) && (rent.getRentalPeriod() != rent.getActualRentalPeriod())) {
                    rentCost = (rent.getActualRentalPeriod() * vehicle.getRentalPriceWithDiscount()) + (remainingDays * (vehicle.getRentalPriceWithDiscount() * 0.5));
                }
            }
        }

        return rentCost;
    }
}
