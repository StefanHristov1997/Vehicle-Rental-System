package utils;

import model.entity.Rent;
import model.entity.Vehicle;

public interface RentCalculator {

    double calculateRent(Vehicle vehicle, Rent rent);
}
