package com.bookingsystem.bookingsystem.model;


import javax.persistence.*;

@Entity
public class Account  {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
