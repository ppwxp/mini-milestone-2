package org.example.powerplants;

public enum PowerPlants {
    Coal(7, 100),Solar(2, 0);
    private int energyProduced;
    private int consumed;

    public int getEnergyProduced() {
        return energyProduced;
    }

    public int getConsumed() {
        return consumed;
    }

    PowerPlants(int energyProduced, int consumed) {
        this.energyProduced = energyProduced;
        this.consumed = consumed;
    }
}
