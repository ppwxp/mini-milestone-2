package org.example;

import org.example.powerplants.CoalPlant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Simulation simulation = new Simulation();
        simulation.addCoalMines(10);
        System.out.println(simulation.getFuelUsedPerMonth());
    }
}