package utils;

import model.entity.*;

public interface InsuranceCalculator {

    double calculateCarInsurance(Car car, Rent rent);

    double calculateMotorcycleInsurance(Motorcycle motorcycle, Rent rent, Customer customer);

    double calculateCargoVanInsurance(CargoVan cargoVan, Rent rent, Customer customer);
}
