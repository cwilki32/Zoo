package com.company;

import java.util.ArrayList;
import java.util.List;

public class AnimalEnclosure extends Building {

    private final String list; //need one for each animal, tiger penguin lion bear

    private Building enclosure1;
    private Building enclosure2;
    private Building enclosure3;
    private Building enclosure4;

    private Lion lion;
    private Bear bear;
    private Penguin penguin;
    private Tiger tiger;

    List<Tiger> tigersList = new ArrayList<Tiger>();
    List<Penguin> penguinsList = new ArrayList<Penguin>();
    List<Bear> bearList = new ArrayList<Bear>();
    List<Lion> lionList = new ArrayList<Lion>();


    public AnimalEnclosure(String list) {
        super(1, 4, false);
        this.list = list;

    }

    public void addAnimalEnclosure1(Bear bear) {
        this.bear = bear;
        bearList.add(bear);
    }

    public void addAnimalEnclosure2(Lion lion) {
        this.lion = lion;
        lionList.add(lion);
    }

    public void addAnimalEnclosure3(Penguin penguin) {
        this.penguin = penguin;
        penguinsList.add(penguin);
    }

    public void addAnimalEnclosure4(Tiger tiger) {
        this.tiger = tiger;
        tigersList.add(tiger);
    }

    public void printDetailsBear() {
        System.out.println('\n' + "This enclosure contains " + list);
        for (int i = 0; i < bearList.size(); i++) {
            System.out.print(bearList.get(i).getName() + " ");
        }
    }

    public void printDetailsLion() {
        System.out.println('\n' + "This enclosure contains " + list);
        for (int i = 0; i < lionList.size(); i++) {
            System.out.print(lionList.get(i).getName() + " ");
        }
    }

    public void printDetailsPenguin() {
        System.out.println('\n' + "This enclosure contains " + list);
        for (int i = 0; i < penguinsList.size(); i++) {
            System.out.print(penguinsList.get(i).getName() + " ");
        }
    }

    public void printDetailsTiger() {
        System.out.println('\n' + "This enclosure contains " + list);
        for (int i = 0; i < tigersList.size(); i++) {
            System.out.print(tigersList.get(i).getName() + " ");
        }
    }
}
