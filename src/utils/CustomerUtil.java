package utils;

import model.entity.Customer;

import java.util.Scanner;

public interface CustomerUtil {

    Customer createCustomer(String vehicleType, Scanner sc);
}
