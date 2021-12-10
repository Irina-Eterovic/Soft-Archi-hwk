package com.hwk.builder;

import com.hwk.builder.builders.RocketBuilder;
import com.hwk.builder.builders.SpaceStationBuilder;
import com.hwk.builder.director.Director;
import com.hwk.builder.products.Rocket;
import com.hwk.builder.products.SpaceStation;

public class Application {
    public static void main(String[] args) {
        Director laNasa = new Director();
        RocketBuilder rocketBuilder = new RocketBuilder();
        laNasa.buildRocket(rocketBuilder);
        Rocket apolloL = rocketBuilder.getResult();
        System.out.println("Rocket engine type: "+ apolloL.getEngine());
        System.out.println("Rocket created with passanger capacity: "+ apolloL.getCapacity());
        System.out.println("Rocket created with control panel : "+ apolloL.getControlPanel().getOs());
        SpaceStationBuilder spaceStationBuilder = new SpaceStationBuilder();
        laNasa.buildSpaceStation(spaceStationBuilder);
        SpaceStation internationalStation = spaceStationBuilder.getResult();
        internationalStation.getRooms();
        System.out.println("Space Station engine type: "+ internationalStation.getEngine());
    }
}
