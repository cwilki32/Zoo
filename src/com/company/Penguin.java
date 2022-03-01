package com.company;

public class Penguin extends Animal{
    private String type;
    private boolean canFly;

    public Penguin (boolean eatsMeat, String name, int noOfLegs, String type, boolean canFly) {
        super(false, name, 2);
        this.type = type;
        this.canFly = canFly;
    }

    public String getType() {
        return type;
    }

    public boolean isCanFly() {
        return canFly;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Animal Type: " + this.getClass().getSimpleName() + "\n" + "Type: " + type + " " + "Can fly? " + canFly);
    }
}
