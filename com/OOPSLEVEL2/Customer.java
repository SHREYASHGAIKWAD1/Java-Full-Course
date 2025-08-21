package com.OOPSLEVEL2;

public class Customer {
    //State
    private String name;
    private Address homeAddress;
    private Address workAddress;

    //Creating
    public Customer(String name, Address homeAdress) {
        this.name = name;
        this.homeAddress = homeAdress;
    }

    //Operations
    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString() {
        return String.format("Name - [%s] | Homeaddress - [%s]  | Workaddress - [%s]", name, homeAddress, workAddress);
    }


}
