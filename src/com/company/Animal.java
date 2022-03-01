package com.company;

public class Animal { //
    private boolean eatsMeat;
    private String name;
    private int noOfLegs;

    public Animal(boolean eatsMeat, String name, int noOfLegs) { //constructor for animal
        this.eatsMeat = eatsMeat;
        this.name = name;
        this.noOfLegs = noOfLegs;
    }
    public int getNoOfLegs() { // getters
        return noOfLegs;
    }

    public String getName() {
        return name;
    }

    public boolean getEatsMeat() {
        return eatsMeat;
    }

    public void printDetails() {
        System.out.println("Name: " + name + " " + "Eats meat? " + eatsMeat + "Count of Legs: " + noOfLegs);
    }
}
