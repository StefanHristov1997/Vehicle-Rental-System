package utils.impl;

import utils.PrintUtil;

import java.util.List;

public class PrintUtilImpl implements PrintUtil {
    @Override
    public void sendToCustomer(List<String> messages) {
        messages.forEach(System.out::println);
    }
}
