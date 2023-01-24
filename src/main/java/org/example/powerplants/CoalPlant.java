package org.example.powerplants;

import org.example.mines.Mine;

public class CoalPlant extends PowerPlant {

    public CoalPlant() {

        super(PowerPlants.Coal.getEnergyProduced(), PowerPlants.Coal.getConsumed());
    }
}
