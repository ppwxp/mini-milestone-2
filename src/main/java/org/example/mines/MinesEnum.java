package org.example.mines;

public enum MinesEnum {
    CoalMine(40),UraniumMine(100);

    public int getEnergy() {
        return energy;
    }

    private int energy;

    MinesEnum(int energy) {
        this.energy = energy;
    }
}
