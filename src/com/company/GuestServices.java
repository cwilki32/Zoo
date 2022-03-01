package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuestServices extends Building {
    private String buildingName;
    private boolean hasFood;
    private boolean hasAlcohol;

    List<GuestServices> listOfServices = new ArrayList<>();

    public GuestServices(int noOfStories, int noOfWindows, boolean hasBathroom, String buildingName, boolean hasFood,
                         boolean hasAlcohol) {
        super(noOfStories, noOfWindows, hasBathroom);
        this.buildingName = buildingName;
        this.hasFood = hasFood;
        this.hasAlcohol = hasAlcohol;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public boolean isHasFood() {
        return hasFood;
    }

    public boolean isHasAlcohol() {
        return hasAlcohol;
    }

    public void serviceInformation() {
        System.out.println('\n'+ "Building name: " + getBuildingName());
        System.out.println("Services include: " + "Bathrooms? " + isHasBathroom() + " Serve food " +  isHasFood() +
                " Serve alcohol? " + isHasAlcohol());
    }
}
