package utils.impl;

import model.entity.Customer;
import model.entity.Invoice;
import model.entity.Rent;
import model.entity.Vehicle;
import utils.InsuranceCalculator;
import utils.InvoiceCalculator;
import utils.InvoiceUtil;
import utils.RentCalculator;

public class InvoiceUtilImpl implements InvoiceUtil {
    @Override
    public Invoice createInvoice(InvoiceCalculator invoiceCalculator, RentCalculator rentCalculator, InsuranceCalculator insuranceCalculator, Vehicle vehicle, Rent rent, Customer customer) {

        final double rentAmount = rentCalculator.calculateRent(vehicle, rent);

        final double insuranceAmount = insuranceCalculator.calculateInsurance(vehicle, rent, customer);

        Invoice invoice = new Invoice(1L, rent.getActualReturnDate(), customer,
                vehicle, rent, rentAmount, insuranceAmount);

        final double issueInvoice = invoiceCalculator.calculateInvoice(invoice);

        invoice.setTotalAmount(issueInvoice);

        return invoice;
    }
}
