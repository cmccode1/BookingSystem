package com.bookingsystem.bookingsystem.model;

import com.bookingsystem.bookingsystem.enums.CarBodyTypeEnum;
import com.bookingsystem.bookingsystem.enums.FuelTypeEnum;
import com.bookingsystem.bookingsystem.enums.VehicleMakeEnum;
import com.bookingsystem.bookingsystem.enums.VehicleTypeEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private int seats;
    private boolean modified;
    private CarBodyTypeEnum bodyType;
    private boolean rightHandDrive;
    private VehicleTypeEnum type;
    private String colour;
    private int wheelCount;
    private int hp;
    private VehicleMakeEnum make;
    private FuelTypeEnum fuel;
    private double mpg;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

    public CarBodyTypeEnum getBodyType() {
        return bodyType;
    }

    public void setBodyType(CarBodyTypeEnum bodyType) {
        this.bodyType = bodyType;
    }

    public boolean isRightHandDrive() {
        return rightHandDrive;
    }

    public void setRightHandDrive(boolean rightHandDrive) {
        this.rightHandDrive = rightHandDrive;
    }

    public VehicleTypeEnum getType() {
        return type;
    }

    public void setType(VehicleTypeEnum type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public VehicleMakeEnum getMake() {
        return make;
    }

    public void setMake(VehicleMakeEnum make) {
        this.make = make;
    }

    public FuelTypeEnum getFuel() {
        return fuel;
    }

    public void setFuel(FuelTypeEnum fuel) {
        this.fuel = fuel;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
}
