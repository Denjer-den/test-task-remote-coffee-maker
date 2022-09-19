package com.dkrysov.remotecoffeemaker.controllers;

import com.dkrysov.remotecoffeemaker.entities.CoffeeMaker;
import com.dkrysov.remotecoffeemaker.services.CoffeeMakerManager;
import com.dkrysov.remotecoffeemaker.repository.CoffeeMakerRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/coffee-maker")
@Api(value = "Remote control system by coffee maker")
public class RestController {

    private final CoffeeMakerRepository coffeeMakerRepository;
    private final CoffeeMakerManager coffeeMakerManager;

    @Autowired
    public RestController(CoffeeMakerRepository coffeeMakerRepository, CoffeeMakerManager coffeeMakerManager) {
        this.coffeeMakerRepository = coffeeMakerRepository;
        this.coffeeMakerManager = coffeeMakerManager;
    }

    @ApiOperation(value = "turn on the coffee maker")
    @PostMapping("/turn-on/{userName}")
    public String turnOn(@PathVariable String userName) {
        coffeeMakerRepository.save(coffeeMakerManager.turnOnCoffeeMaker(userName));
        return "Coffeemaker turned on!";
    }

    @ApiOperation(value = "turn off the coffee maker")
    @PutMapping("/turn-off")
    public String turnOff() {
        coffeeMakerRepository.save(coffeeMakerManager.turnOffCoffeeMaker());
        return "Coffeemaker turned off!";
    }

    @ApiOperation(value = "Get current status")
    @GetMapping("/status")
    public String getStatus() {
        return coffeeMakerManager.getStatus();
    }

    @ApiOperation(value = "Get all usage history")
    @GetMapping("/history")
    public List<CoffeeMaker> getHistory() {
        return coffeeMakerRepository.findAll();
    }

    @ApiOperation(value = "Delete usage history")
    @DeleteMapping
    public String deleteHistory() {
        coffeeMakerRepository.deleteAll();
        return "Usage history cleared!";
    }
}
