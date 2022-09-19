package com.dkrysov.remotecoffeemaker.services;

import com.dkrysov.remotecoffeemaker.entities.CoffeeMaker;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.MediaSize;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Service
public class CoffeeMakerManager {

    private final CoffeeMaker coffeeMaker = new CoffeeMaker();

    public CoffeeMaker turnOnCoffeeMaker(String userName) {
        Date date = new Date();
        coffeeMaker.setUserName(userName);
        coffeeMaker.setTurnOnnTime(date.toString());
        coffeeMaker.setId(date.getTime());
        coffeeMaker.setTurnOn(true);
        return coffeeMaker;
    }

    public CoffeeMaker turnOffCoffeeMaker() {
        Date date = new Date();
        coffeeMaker.setTurnOffTime(date.toString());
        coffeeMaker.setTurnOn(false);
        return coffeeMaker;
    }

    public String getStatus() {
        if (coffeeMaker.isTurnOn()) {
            Date date = new Date();
            return "The coffee maker was turned on by" + coffeeMaker.getUserName()
                    + TimeUnit.MILLISECONDS.toMinutes((date.getTime() - coffeeMaker.getId())) + " minutes ago";
        }
        return "The coffee maker is turned off";
    }
}
