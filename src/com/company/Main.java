package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a new project named Zoo
        //Create a class named Animal and Building and give each some basic properties
        //Create several classes for specific types of animals in the Zoo
            //subclasses of animals - Lion, Tiger, Bear, Penguin
        //These classes should extend the Animal class
               //Each specific animal class should have several properties unique to that animal
        //Create a new class that extends Building named AnimalEnclosure
        //AnimalEnclosure should have some properties including a list of Animals in the enclosure
        //Create new class that extends Building named GuestServices to represent the various restaurants,
             // bathrooms, visitor centers, etc. available to zoo guests
        //GuestService should have several properties that a zoo guest service building might have, including a list of
              // services offered
        //In the console, allow a user to get information about each GuestService and Enclosure building and print that
             //  information to the console.
        //Bonus: Create a menu item that lets the user search for a specific animal type and find what enclosure they
            // are in.
        //Super Bonus: Create a menu option for zoo employees to add animals to enclosures and add services to guest
             //  service building

        List<GuestServices> listOfServices = new ArrayList<>();

        Scanner scanner = new Scanner (System.in);
        int userInput = scanner.nextInt();


        Tiger tiger1 = new Tiger(true, "Tony", 4, "Orange", true);
        Tiger tiger2 = new Tiger(true, "Peter", 4, "Black", false);
        Penguin penguin1 = new Penguin(false, "Pip", 2, "King" , false);
        Bear bear1 = new Bear(true, "Pancake", 3, "White", "Polar");
        Bear bear2 = new Bear(true, "Brian", 4, "Black", "Grizzly");
        Lion lion1 = new Lion(true, "Mufasa", 4, "Gold", true);
        Lion lion2 = new Lion (true, "Lonnie", 4, "Brown", true);
        GuestServices bar = new GuestServices(3, 50, true, "Animal House",
                true, true);
        GuestServices restaurant = new GuestServices(2, 1, true, "Food under 21",
                true, false);
        GuestServices bathrooms = new GuestServices(1, 0, true, "Bathrooms",
                false, false);
        AnimalEnclosure bearEnclosure = new AnimalEnclosure("Bears");
        AnimalEnclosure tigerEnclosure = new AnimalEnclosure("Tigers");
        AnimalEnclosure penguinEnclosure = new AnimalEnclosure("Penguins");
        AnimalEnclosure lionEnclosure = new AnimalEnclosure("Lions");

        tiger1.printDetails();
        penguin1.printDetails();
        lion1.printDetails();
        bear1.printDetails();
        bear2.printDetails();
        listOfServices.add(bar);
        listOfServices.add(restaurant);
        listOfServices.add(bathrooms);
//        bar.addServices(listOfServices);
//        restaurant.addServices(listOfServices);
//        bathrooms.addServices(listOfServices);
        bearEnclosure.addAnimalEnclosure1(bear1);
        bearEnclosure.addAnimalEnclosure1(bear2);
        lionEnclosure.addAnimalEnclosure2(lion1);
        lionEnclosure.addAnimalEnclosure2(lion2);
        penguinEnclosure.addAnimalEnclosure3(penguin1);
        tigerEnclosure.addAnimalEnclosure4(tiger1);
        tigerEnclosure.addAnimalEnclosure4(tiger2);
        bearEnclosure.printDetailsBear();
        tigerEnclosure.printDetailsTiger();
        penguinEnclosure.printDetailsPenguin();
        lionEnclosure.printDetailsLion();

        bar.serviceInformation();
        restaurant.serviceInformation();
        bathrooms.serviceInformation();
//        System.out.println("\n" + "Building name: " + restaurant.getBuildingName() +
//                ". Services include: " + "Bathrooms? " + restaurant.isHasBathroom() + ". Serves Wine and Beer? " +
//                restaurant.isHasAlcohol() + ". Does it have food? " + restaurant.isHasFood());
//        System.out.println("\n" + "Building name: " + bar.getBuildingName() +
//                ". Services include: " + "Bathrooms? " + bar.isHasBathroom() + ". Serves Wine and Beer? " +
//                bar.isHasAlcohol() + ". Does it have food? " + bar.isHasFood());
//        System.out.println("\n" + "Building name: " + bathrooms.getBuildingName() +
//                ". Services include: " + "Bathrooms? " + bathrooms.isHasBathroom() + ". Serves Wine and Beer? " +
//                bathrooms.isHasAlcohol() + ". Does it have food? " + bathrooms.isHasFood());


    }
}
