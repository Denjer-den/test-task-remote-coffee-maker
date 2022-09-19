package com.dkrysov.remotecoffeemaker.repository;

import com.dkrysov.remotecoffeemaker.entities.CoffeeMaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeMakerRepository extends JpaRepository<CoffeeMaker,Long> {

}
