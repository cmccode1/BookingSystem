package com.bookingsystem.bookingsystem.model;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account  extends BaseEntity{

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int accountNumber;
    @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @OneToMany
    @JoinColumn(name = "car_id")
    @OrderColumn
    private Car[] cars;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

}
