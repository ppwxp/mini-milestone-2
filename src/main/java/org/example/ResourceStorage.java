package org.example;

import org.example.mines.CoalMine;
import org.example.mines.Mine;
import org.example.mines.UraniumMine;
import org.example.powerplants.CoalPlant;
import org.example.powerplants.PowerPlant;
import org.example.powerplants.SolarPlant;

import java.util.ArrayList;
import java.util.List;

public class ResourceStorage {
//    private int fuelGot = getConsumedFuel();
//    private int fuelConsumed = getFuelUsedPerMonth();
//    private int energyProduced = getEnergyProduced();
    private List<Mine> minesList = new ArrayList<>();
    private List<PowerPlant> powerPlants = new ArrayList<>();

    public void addCoalMines(int numberOfMines){
        for (int i=0; i <= numberOfMines; i++){
            CoalMine coalMine = new CoalMine();
            minesList.add(coalMine);
        }
    }
    public void addCoalPlants(int numberOfPlants){
        for (int i=0; i <= numberOfPlants; i++){
            CoalPlant coalPlant = new CoalPlant();
            powerPlants.add(coalPlant);
        }
    }


    public int getFuelUsedPerMonth(){
        int fuel = 0;
        for(Mine mine : minesList){
            fuel += mine.getFuelUsed();
        }
        return fuel * 30;
    }
    public int getEnergyProduced(){
        int fuel = 0;
        for (PowerPlant powerPlant : powerPlants){
            fuel += powerPlant.getEnergyProduced();
        }
        return fuel * 30;
    }
    public int getConsumedFuel(){
        int fuel = 0;
        for (PowerPlant powerPlant : powerPlants){
            fuel += powerPlant.getFuelTaken();
        }
        return fuel * 30;
    }


    public void addUraniumMine(int numberOfMines) {
        for (int i=0; i <= numberOfMines; i++){
            UraniumMine uraniumMine = new UraniumMine();
            minesList.add(uraniumMine);
        }
    }

    public void addSolarPlants(int numberOfPlants) {
        for (int i=0; i <= numberOfPlants; i++){
            SolarPlant solarPlant = new SolarPlant();
            powerPlants.add(solarPlant);
        }
    }
}
