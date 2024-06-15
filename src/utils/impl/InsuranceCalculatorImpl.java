package utils.impl;

import model.entity.*;
import utils.InsuranceCalculator;

public class InsuranceCalculatorImpl implements InsuranceCalculator {

    @Override
    public double calculateInsurance(Vehicle vehicle, Rent rent, Customer customer) {

        double insuranceCost = 0;

        switch (vehicle.getType()) {
            case CAR -> {
                Car car = (Car) vehicle;
                if ((car.getSafetyRating() <= 3) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    insuranceCost = rent.getRentalPeriod() * car.getInsurancePricePerDay();
                } else if ((car.getSafetyRating() > 3) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    insuranceCost = rent.getRentalPeriod() * ((car.getInsurancePricePerDay() * 0.9));
                } else if (((car.getSafetyRating() <= 3) && (rent.getRentalPeriod() != rent.getActualRentalPeriod()))) {
                    insuranceCost = rent.getActualRentalPeriod() * car.getInsurancePricePerDay();
                } else if ((car.getSafetyRating() > 3) && (rent.getRentalPeriod() != rent.getActualRentalPeriod())) {
                    insuranceCost = rent.getActualRentalPeriod() * (car.getInsurancePricePerDay() * 0.9);
                }
            }
            case MOTORCYCLE -> {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                if ((customer.getAge() >= 25) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    insuranceCost = rent.getRentalPeriod() * motorcycle.getInsurancePricePerDay();
                } else if ((customer.getAge() < 25) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    insuranceCost = rent.getRentalPeriod() * (motorcycle.getInsurancePricePerDay()
                            + (motorcycle.getInsurancePricePerDay() * 0.2));
                } else if (((customer.getAge() >= 25) && (rent.getRentalPeriod() != rent.getActualRentalPeriod()))) {
                    insuranceCost = rent.getActualRentalPeriod() * motorcycle.getInsurancePricePerDay();
                } else if ((customer.getAge() < 25) && (rent.getRentalPeriod() != rent.getActualRentalPeriod())) {
                    insuranceCost = rent.getActualRentalPeriod() * (motorcycle.getInsurancePricePerDay()
                            + (motorcycle.getInsurancePricePerDay() * 0.2));
                }
            }
            case CARGO_VAN -> {
                CargoVan cargoVan = (CargoVan) vehicle;
                if ((customer.getDriveExperience() <= 5) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    insuranceCost = rent.getRentalPeriod() * cargoVan.getInsurancePricePerDay();
                } else if ((customer.getDriveExperience() > 5) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
                    insuranceCost = rent.getRentalPeriod() * (cargoVan.getInsurancePricePerDay() * 0.85);
                } else if (((customer.getDriveExperience() <= 5) && (rent.getRentalPeriod() != rent.getActualRentalPeriod()))) {
                    insuranceCost = rent.getActualRentalPeriod() * cargoVan.getInsurancePricePerDay();
                } else if ((customer.getDriveExperience() > 5) && (rent.getRentalPeriod() != rent.getActualRentalPeriod())) {
                    insuranceCost = rent.getActualRentalPeriod() * (cargoVan.getInsurancePricePerDay() * 0.85);
                }
            }
        }

        return insuranceCost;
    }
}


