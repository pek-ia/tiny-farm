package com.example.tinyfarm;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Farm f = new Farm();

        FarmAnimal a = new Cat("Sylvester");
        f.add(a);

//        Man stranger = new Man();
//        Animal a1 = stranger.buyAnimal(100000.);
//        f.add((FarmAnimal)a1);

        f.add( new Cat("Bernie") );
        f.add(new Dog("Louie"));
        f.add(new Cat("Puddles"));
        f.add(new Dog("Max"));

        Collections.sort(f.animals);
        f.feedAnimals();

        f.saveAnimalsToFile();
    }
}
