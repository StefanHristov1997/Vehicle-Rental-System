package utils;

import model.entity.*;

public interface InsuranceCalculator {

    double calculateCarInsurance(Car car, Rent rent, Customer customer);

    double calculateMotorcycleInsurance(Motorcycle motorcycle, Rent rent, Customer customer);

    double calculateCargoVanInsurance(CargoVan cargoVan, Rent rent, Customer customer);
}
