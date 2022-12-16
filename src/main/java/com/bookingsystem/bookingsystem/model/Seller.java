package com.bookingsystem.bookingsystem.model;

import javax.persistence.*;

@Entity
public class Seller  {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private int vehicleCount;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }
}
