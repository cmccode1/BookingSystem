package com.bookingsystem.bookingsystem.model;

import com.bookingsystem.bookingsystem.enums.CurrencyEnum;
import com.bookingsystem.bookingsystem.enums.SalesStatusEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sales  extends BaseEntity {


    private double cost;
    private CurrencyEnum currency;
    private SalesStatusEnum status;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    public SalesStatusEnum getStatus() {
        return status;
    }

    public void setStatus(SalesStatusEnum status) {
        this.status = status;
    }
}
