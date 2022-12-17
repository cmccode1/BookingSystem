package com.bookingsystem.bookingsystem.model;

import javax.persistence.*;

@Entity
public class Buyer  extends BaseEntity{


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
