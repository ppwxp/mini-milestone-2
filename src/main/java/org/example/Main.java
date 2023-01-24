package org.example;

import org.example.consumers.EnergyConsumers;

public class Main {
    public static void main(String[] args) {
        ResourceStorage resourceStorage = new ResourceStorage();
        resourceStorage.addCoalMines(100);
        resourceStorage.addCoalPlants(10);
        resourceStorage.addUraniumMine(1);
        resourceStorage.addSolarPlants(10);
        int energyProduced = resourceStorage.getEnergyProduced() - resourceStorage.getFuelUsedPerMonth();
        if (EnergyConsumers.WORLD.getConsumedUnitsPerDay() * 30 <= energyProduced){
            System.out.println("Dont enough energy produced");
        }else{
            System.out.println("Energy Consumed in WORLD:" + EnergyConsumers.WORLD.getConsumedUnitsPerDay());
            System.out.println("Energy Produced: " + energyProduced);
            System.out.println("Units consumed: " + resourceStorage.getConsumedFuel());

        }
        System.out.println(energyProduced + " " + EnergyConsumers.WORLD.getConsumedUnitsPerDay() *30);
    }
}