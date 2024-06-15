package utils.impl;

import messages.customer.MessagesToCustomer;
import model.entity.Customer;
import model.entity.Rent;
import model.entity.Vehicle;
import utils.PrintUtil;
import utils.RentUtil;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class RentUtilImpl implements RentUtil {
    @Override
    public Rent createRent(Scanner sc, PrintUtil printUtil, int rentPeriod, LocalDate returnDate, Customer customer, Vehicle vehicle, LocalDate rentDate) {

        String answer = sc.next().toUpperCase();

        Rent rent = null;

        if (answer.equals("YES")) {
            printUtil.sendToCustomer(List.of(MessagesToCustomer.REDUCE_RENT_PERIOD));
            int actualRentalPeriod = rentPeriod - sc.nextInt();
            LocalDate actualReturnDate = returnDate.minusDays(rentPeriod - actualRentalPeriod);
            rent = new Rent
                    (customer,
                            vehicle, rentDate, returnDate, actualReturnDate, rentPeriod, actualRentalPeriod);
        } else {
            rent = new Rent
                    (customer,
                            vehicle, rentDate, returnDate, returnDate, rentPeriod, rentPeriod);
        }
        return rent;
    }
}
