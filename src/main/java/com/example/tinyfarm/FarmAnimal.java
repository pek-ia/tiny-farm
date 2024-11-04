package com.example.tinyfarm;

import com.example.tinyfarm.fileio.FileSavable;

abstract public class FarmAnimal implements Animal, Comparable<FarmAnimal>, FileSavable {

    private final String name;
    protected int weight;

    public FarmAnimal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(FarmAnimal o) {
       return this.getName().compareTo(o.getName());
    }

    @Override
    public int getWeight() {
        return weight;
    }


    public String asFileString() {
        return getName() + "|" + getWeight();
    }
}
