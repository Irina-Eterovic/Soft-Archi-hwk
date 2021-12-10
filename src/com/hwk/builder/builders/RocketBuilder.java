package com.hwk.builder.builders;

import com.hwk.builder.products.Rocket;
import com.hwk.builder.spaceshipParts.ControlPanel;
import com.hwk.builder.spaceshipParts.Engine;
import com.hwk.builder.spaceshipParts.FuelTank;

public class RocketBuilder implements IBuilder {
    private Engine engine;
    private int capacity;
    private ControlPanel controlPanel;
    private FuelTank tank;

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setCapacity(int passengerCapacity) {
        this.capacity = passengerCapacity;
    }

    @Override
    public void setControlPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    @Override
    public void setFuelTank(FuelTank fuelTank) {
        this.tank = fuelTank;
    }

    public Rocket getResult(){
        return new Rocket(this.capacity, this.controlPanel, this.engine,this.tank);
    }

}
