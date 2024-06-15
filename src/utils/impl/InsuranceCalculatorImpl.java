package utils.impl;

import model.entity.*;
import utils.InsuranceCalculator;

public class InsuranceCalculatorImpl implements InsuranceCalculator {

    @Override
    public double calculateCarInsurance(Car car, Rent rent) {

        double insuranceCost = 0;

        if ((car.getSafetyRating() <= 3) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
            insuranceCost = rent.getRentalPeriod() * car.getInsurancePricePerDay();
        } else if ((car.getSafetyRating() > 3) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
            insuranceCost = rent.getRentalPeriod() * ((car.getInsurancePricePerDay() * 0.9));
        } else if (((car.getSafetyRating() <= 3) && (rent.getRentalPeriod() != rent.getActualRentalPeriod()))) {
            insuranceCost = rent.getActualRentalPeriod() * car.getInsurancePricePerDay();
        } else if ((car.getSafetyRating() > 3) && (rent.getRentalPeriod() != rent.getActualRentalPeriod())) {
            insuranceCost = rent.getActualRentalPeriod() * (car.getInsurancePricePerDay() * 0.9);
        }

        return insuranceCost;
    }

    @Override
    public double calculateMotorcycleInsurance(Motorcycle motorcycle, Rent rent, Customer customer) {

        double insuranceCost = 0;

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

        return insuranceCost;
    }

    @Override
    public double calculateCargoVanInsurance(CargoVan cargoVan, Rent rent, Customer customer) {

        double insuranceCost = 0;

        if ((customer.getDriveExperience() <= 5) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
            insuranceCost = rent.getRentalPeriod() * cargoVan.getInsurancePricePerDay();
        } else if ((customer.getDriveExperience() > 5) && (rent.getRentalPeriod() == rent.getActualRentalPeriod())) {
            insuranceCost = rent.getRentalPeriod() * (cargoVan.getInsurancePricePerDay() * 0.85);
        } else if (((customer.getDriveExperience() <= 5) && (rent.getRentalPeriod() != rent.getActualRentalPeriod()))) {
            insuranceCost = rent.getActualRentalPeriod() * cargoVan.getInsurancePricePerDay();
        } else if ((customer.getDriveExperience() > 5) && (rent.getRentalPeriod() != rent.getActualRentalPeriod())) {
            insuranceCost = rent.getActualRentalPeriod() * (cargoVan.getInsurancePricePerDay() * 0.85);
        }

        return insuranceCost;
    }
}


