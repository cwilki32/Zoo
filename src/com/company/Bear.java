package com.company;

public class Bear extends Animal {
    private String color;
    private String type;

    public Bear(boolean eatsMeat, String name, int noOfLegs, String color, String type) {
        super(true, name, 4);
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }


    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Animal Type: " + this.getClass().getSimpleName() + "\n" + "Color: " + color + " " + "Type? " + type);
    }
}
