package org.example.mines;

public class CoalMine extends Mine{
    public CoalMine(int fuelUsed) {
        super(MinesEnum.CoalMine.getEnergy());
    }
}
