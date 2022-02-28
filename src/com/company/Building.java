package com.company;

public class Building {

    private int noOfStories;
    private int noOfWindows;
    private boolean hasBathroom;

    public Building(int noOfStories, int noOfWindows, boolean hasBathroom) {
        this.noOfStories = noOfStories;
        this.noOfWindows = noOfWindows;
        this.hasBathroom = hasBathroom;
    }

    public int getNoOfStories() {
        return noOfStories;
    }

    public int getNoOfWindows() {
        return noOfWindows;
    }

    public boolean isHasBathroom() {
        return hasBathroom;
    }
}
