package com.hwk.builder.builders;

import com.hwk.builder.spaceshipParts.ControlPanel;
import com.hwk.builder.spaceshipParts.Engine;
import com.hwk.builder.spaceshipParts.FuelTank;

public interface IBuilder {
    public void setEngine(Engine engine);
    public void setCapacity(int passengerCapacity);
    public  void setControlPanel(ControlPanel controlPanel);
    public  void setFuelTank (FuelTank fuelTank);}
