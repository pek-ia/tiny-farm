package com.example.tinyfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<FarmAnimal> animals = new ArrayList<>();

    public void add(FarmAnimal a){
        animals.add(a);
    }

    public void feedAnimals(){
        for (Animal a : animals){
            a.eat();
        }
    }

}

