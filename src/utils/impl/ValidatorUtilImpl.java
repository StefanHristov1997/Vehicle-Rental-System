package utils.impl;

import messages.exception.ExceptionMessages;
import utils.ValidatorUtil;

import java.util.Scanner;

public class ValidatorUtilImpl implements ValidatorUtil {

    @Override
    public String validateVehicleType(String car, String motorcycle, String cargoVan, Scanner sc) {

        String vehicleType = sc.nextLine().toUpperCase();

        while (!vehicleType.equals(car) && !vehicleType.equals(motorcycle) && !vehicleType.equals(cargoVan)) {
            System.out.println(ExceptionMessages.INVALID_VEHICLE_TYPE);
            vehicleType = sc.nextLine().toUpperCase();
        }
        return vehicleType;
    }

    @Override
    public String validateVehicle(String firstBrand, String secondBrand, Scanner sc) {

        String customerChoice = sc.next().toUpperCase();

        while ((!customerChoice.equals(firstBrand)) && (!customerChoice.equals(secondBrand))) {
            System.out.println(ExceptionMessages.INVALID_VEHICLE);
            customerChoice = sc.nextLine().toUpperCase();
        }

        return customerChoice;
    }
}
