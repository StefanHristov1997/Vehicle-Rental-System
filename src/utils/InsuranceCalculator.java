package utils;

import model.entity.*;

public interface InsuranceCalculator {

    double calculateInsurance (Vehicle vehicle, Rent rent, Customer customer);
}
