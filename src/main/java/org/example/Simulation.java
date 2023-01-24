package org.example;

import org.example.mines.CoalMine;
import org.example.mines.Mine;
import org.example.powerplants.CoalPlant;
import org.example.powerplants.PowerPlant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Simulation {

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



}
