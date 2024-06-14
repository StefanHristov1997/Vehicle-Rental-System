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
                double rentalPricePerDayWithDiscount = vehicle.getRentalPricePerDay() - 5;
                if ((rent.getRentalPeriod() < 7) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    rentCost = rent.getRentalPeriod() * vehicle.getRentalPricePerDay();
                } else if ((rent.getRentalPeriod() > 7) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    rentCost = rent.getRentalPeriod() * rentalPricePerDayWithDiscount;
                } else if (((rent.getRentalPeriod() < 7) && (rent.getRentalPeriod() != rent.getActualRentalPeriod()))) {
                    rentCost = (rent.getActualRentalPeriod() * vehicle.getRentalPricePerDay()) + (remainingDays * (vehicle.getRentalPricePerDay() * 0.5));
                } else if ((rent.getRentalPeriod() > 7) && (rent.getRentalPeriod() != rent.getActualRentalPeriod())) {
                    rentCost = (rent.getActualRentalPeriod() * rentalPricePerDayWithDiscount) + (remainingDays * (rentalPricePerDayWithDiscount * 0.5));
                }
            }
            case CARGO_VAN -> {
                double rentalPricePerDayWithDiscount = vehicle.getRentalPricePerDay() - 10;
                if ((rent.getRentalPeriod() < 7) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    rentCost = rent.getRentalPeriod() * vehicle.getRentalPricePerDay();
                } else if ((rent.getRentalPeriod() > 7) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    rentCost = rent.getRentalPeriod() * rentalPricePerDayWithDiscount;
                } else if (((rent.getRentalPeriod() < 7) && (rent.getRentalPeriod() != rent.getActualRentalPeriod()))) {
                    rentCost = (rent.getActualRentalPeriod() * vehicle.getRentalPricePerDay()) + (remainingDays * (rentalPricePerDayWithDiscount * 0.5));
                } else if ((rent.getRentalPeriod() > 7) && (rent.getRentalPeriod() != rent.getActualRentalPeriod())) {
                    rentCost = (rent.getActualRentalPeriod() * rentalPricePerDayWithDiscount) + (remainingDays * (rentalPricePerDayWithDiscount * 0.5));

                }
            }
        }

        return rentCost;
    }
}
