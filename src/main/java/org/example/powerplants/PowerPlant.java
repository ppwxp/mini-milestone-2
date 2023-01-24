package org.example.powerplants;

public abstract class PowerPlant {
    public PowerPlant(int energyProduced, int fuelTaken) {
        this.energyProduced = energyProduced;
        this.fuelTaken = fuelTaken;
    }

    public int getEnergyProduced() {
        return energyProduced;
    }

    public int getFuelTaken() {
        return fuelTaken;
    }

    int energyProduced;
    int fuelTaken;

}
