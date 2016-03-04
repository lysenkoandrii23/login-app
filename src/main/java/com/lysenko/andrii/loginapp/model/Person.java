package com.lysenko.andrii.loginapp.model;

public class Person
{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phoneNumber;
    private String city;
    private String street;
    private String apartment;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String toString()
    {
        return "First Name: " + getFirstName() + " Last Name:  " + getLastName() +
                " Date of birth:      " + getDateOfBirth() + " Phone number:      " + getPhoneNumber() +
                " City:      " + getCity() + " Street:      " + getStreet() + " Apartment:      " + getApartment();
    }
}