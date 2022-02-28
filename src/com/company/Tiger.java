package com.company;

public class Tiger extends Animal{
    private String color;
    private boolean hasStripes;

    public Tiger (boolean eatsMeat, String name, int noOfLegs, String color, boolean hasStripes) {
        super(true, name, 4);
        this.color = color;
        this.hasStripes = hasStripes;
    }
    public String getColor(){
        return color;
    }
    public boolean isHasStripes() {
        return hasStripes;
    }
}
