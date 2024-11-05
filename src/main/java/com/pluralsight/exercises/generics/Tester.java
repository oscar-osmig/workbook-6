package com.pluralsight.exercises.generics;

import java.util.List;

public class Tester<T, U> {
    private List<T> thingT;
    private List<U> thingU;

    public Tester(List<T> thingT, List<U> thingU) {
        this.thingT = thingT;
        this.thingU = thingU;
    }

    public void printT(){
        System.out.println(thingT);
    }

    public void printU(){
        System.out.println(thingU);
    }

    public List<T> getThingT() {
        return thingT;
    }

    public void setThingT(List<T> thingT) {
        this.thingT = thingT;
    }

    public List<U> getThingU() {
        return thingU;
    }

    public void setThingU(List<U> thingU) {
        this.thingU = thingU;
    }
}
