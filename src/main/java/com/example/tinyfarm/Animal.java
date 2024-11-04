package com.example.tinyfarm;

public interface Animal {

    void eat();

    default int getWeight() {
        return 100;
    }
}
