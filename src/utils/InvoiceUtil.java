package utils;

import model.entity.Customer;
import model.entity.Invoice;
import model.entity.Rent;
import model.entity.Vehicle;

public interface InvoiceUtil {

    Invoice createInvoice(InvoiceCalculator invoiceCalculator,
                          RentCalculator rentCalculator,
                          InsuranceCalculator insuranceCalculator,
                          Vehicle vehicle,
                          Rent rent,
                          Customer customer );
}
