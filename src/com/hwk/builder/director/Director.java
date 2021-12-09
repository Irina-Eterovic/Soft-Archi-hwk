package com.hwk.builder.director;

import com.hwk.builder.builders.IBuilder;
import com.hwk.builder.spaceshipParts.ControlPanel;
import com.hwk.builder.spaceshipParts.Engine;
import com.hwk.builder.spaceshipParts.FuelTank;

public class Director {
    public void buildSpaceStation(IBuilder builder){
        builder.setCapacity(20);
        builder.setEngine(Engine.FLOATING_ENGINE);
        builder.setControlPanel(new ControlPanel("NASA OS"));
        builder.setFuelTank(new FuelTank(100));
    }
    public void buildRocket(IBuilder builder){
        builder.setCapacity(4);
        builder.setEngine(Engine.TURBO_ENGINE);
        builder.setControlPanel(new ControlPanel("SPACEX OS"));
        builder.setFuelTank(new FuelTank(100000));
    }
}
