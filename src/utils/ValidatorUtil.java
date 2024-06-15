package utils;

import java.util.Scanner;

public interface ValidatorUtil {
    String validateVehicleType(String car, String motorcycle, String cargoVan, Scanner sc);
    String validateVehicle(String firstBrand, String secondBrand, Scanner sc);
}
