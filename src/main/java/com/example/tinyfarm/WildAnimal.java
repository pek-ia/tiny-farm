package com.example.tinyfarm;

abstract public class WildAnimal implements Animal {

    @Override
    public void eat() {
        System.out.println("CHOMP!!!  I ate your hand.  It was yummy");
    }



}
