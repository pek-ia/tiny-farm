package com.example.tinyfarm;

import com.example.tinyfarm.fileio.FarmFileManager;

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
            System.out.println(a.getWeight());

        }
    }

    public void saveAnimalsToFile() {
        FarmFileManager ffm = new FarmFileManager();
        ffm.saveAnimalsToFile(animals);
    }
}

