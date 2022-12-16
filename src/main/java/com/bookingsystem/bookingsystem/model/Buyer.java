package com.bookingsystem.bookingsystem.model;

import javax.persistence.*;

@Entity
public class Buyer {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;


    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


}
