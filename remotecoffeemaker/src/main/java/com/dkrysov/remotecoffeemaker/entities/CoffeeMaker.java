package com.dkrysov.remotecoffeemaker.entities;

import javax.persistence.*;

@Entity
@Table(name = "coffeemaker")
public class CoffeeMaker {

    @Id
    private long id;
    @Column(name = "turn_on_time")
    private String turnOnTime;
    @Column(name = "turn_off_time")
    private String turnOffTime;
    @Column(name = "turn_on_status")
    private boolean turnOn = false;
    @Column(name = "user")
    private String userName;

    public CoffeeMaker() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTurnOnnTime() {
        return turnOnTime;
    }

    public void setTurnOnnTime(String turnOnTime) {
        this.turnOnTime = turnOnTime;
    }

    public String getTurnOffTime() {
        return turnOffTime;
    }

    public void setTurnOffTime(String turnOffTime) {
        this.turnOffTime = turnOffTime;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public String getUserName() {return userName;}

    public void setUserName(String userName) {this.userName = userName;}
}
