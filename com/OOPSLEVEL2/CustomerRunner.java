package com.OOPSLEVEL2;

public class CustomerRunner {

    public static void main(String[] args) {

        Address homeAddress = new Address("Line 1", "Pune", "411023");
        Customer customer = new Customer("shreyash", homeAddress);

        Address workAddress = new Address("Line 1 for work", "Pune", "411045");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }

}
