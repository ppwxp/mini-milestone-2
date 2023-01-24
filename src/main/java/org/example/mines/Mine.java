package org.example.mines;

public abstract class Mine {
    public Mine(int fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public int getFuelUsed() {
        return fuelUsed;
    }

    private int fuelUsed;

}
