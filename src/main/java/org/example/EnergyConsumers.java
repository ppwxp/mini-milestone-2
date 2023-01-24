package org.example;

public enum EnergyConsumers {
    WORLD(6000000), POLAND(40000), NEW_YORK(10000);

    private int consumedUnitsPerDay;
    EnergyConsumers(int consumedUnitsPerDay) {
        this.consumedUnitsPerDay = consumedUnitsPerDay;
    }
    public int getConsumedUnitsPerDay() {
        return consumedUnitsPerDay;
    }

}
