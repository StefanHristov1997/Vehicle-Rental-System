package utils;

import model.entity.Customer;
import model.entity.Rent;
import model.entity.Vehicle;

import java.time.LocalDate;
import java.util.Scanner;

public interface RentUtil {

    Rent createRent(Scanner sc,
                    PrintUtil printUtil,
                    int rentPeriod,
                    LocalDate returnDate,
                    Customer customer,
                    Vehicle vehicle,
                    LocalDate rentDate);

}
