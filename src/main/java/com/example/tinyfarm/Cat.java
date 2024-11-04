package com.example.tinyfarm;

public class Cat extends FarmAnimal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + ": Nibble.  Nibble.  Yum.");
        weight += 2;
    }
}
