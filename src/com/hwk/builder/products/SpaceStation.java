package com.hwk.builder.products;

import com.hwk.builder.spaceshipParts.ControlPanel;
import com.hwk.builder.spaceshipParts.Engine;
import com.hwk.builder.spaceshipParts.FuelTank;

public class SpaceStation {
    private int capacity;
    private ControlPanel controlPanel;
    private Engine engine;
    private FuelTank fuelTank;

    public SpaceStation(int capacity, ControlPanel controlPanel, Engine engine, FuelTank fuelTank) {
        this.capacity = capacity;
        this.controlPanel = controlPanel;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public void setControlPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void getRooms(){
        System.out.println("This space station has a kitchen, sleeping quarters, control room and a big window room");
    }
}
