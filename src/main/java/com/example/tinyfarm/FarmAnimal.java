package com.example.tinyfarm;

abstract public class FarmAnimal extends Animal {

    public FarmAnimal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
}
