package com.company;

public class Lion extends Animal {
    private String color;
    private boolean hasMane;

    public Lion(boolean eatsMeat, String name, int noOfLegs, String color, boolean hasMane) {
        super(true, name, 4);
        this.color = color;
        this.hasMane = hasMane;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasMane() {
        return hasMane;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Animal Type: " + this.getClass().getSimpleName() + "\n" + "Color: " + color + " " + "Has mane? " + hasMane);
    }
}
