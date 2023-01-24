package org.example.powerplants;

public class SolarPlant extends PowerPlant{
    public SolarPlant() {
        super(PowerPlants.Solar.getEnergyProduced(), PowerPlants.Solar.getConsumed());
    }
}
