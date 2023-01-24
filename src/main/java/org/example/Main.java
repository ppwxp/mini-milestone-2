package org.example;

import org.example.powerplants.CoalPlant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CoalPlant coalPlant = new CoalPlant();
        System.out.println(coalPlant.getEnergyProduced());
    }
}