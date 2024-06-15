package utils.impl;

import messages.customer.MessagesToCustomer;
import model.entity.Customer;
import utils.CustomerUtil;

import java.util.Scanner;

public class CustomerUtilImpl implements CustomerUtil {
    @Override
    public Customer createCustomer(String vehicleType, Scanner sc) {

        Customer customer = null;
        switch (vehicleType) {
            case "CAR" -> {
                System.out.println(MessagesToCustomer.GREETING_FOR_CHOICE_CAR);
                final String firstName = sc.nextLine();
                final String lastName = sc.nextLine();
                customer = new Customer(1L, firstName, lastName);
            }
            case "MOTORCYCLE", "CARGO_VAN" -> {
                System.out.println(MessagesToCustomer.GREETING_FOR_CHOICE_MOTOR_CARGO);
                final String firstName = sc.nextLine();
                final String lastName = sc.nextLine();
                final int age = sc.nextInt();
                final int drivenExperience = sc.nextInt();
                customer = new Customer(1L, firstName, lastName, age, drivenExperience);
            }
        }
        return customer;
    }
}
