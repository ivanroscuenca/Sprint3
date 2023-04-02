package controller;

import commands.Bicycle.BicycleBrake;
import commands.Bicycle.BicycleOff;
import commands.Bicycle.BicycleOn;
import commands.Boat.BoatBrake;
import commands.Boat.BoatOff;
import commands.Boat.BoatOn;
import commands.Car.CarBrake;
import commands.Car.CarOff;
import commands.Car.CarOn;
import commands.Plane.PlaneBrake;
import commands.Plane.PlaneOff;
import commands.Plane.PlaneOn;
import vehicles.Bicycle;
import vehicles.Boat;
import vehicles.Car;
import vehicles.Plane;

public class Config {

    public static void configuration (Control control){
        Car car = new Car();

        Boat boat = new Boat();

        Bicycle bike = new Bicycle();

        Plane airForce = new Plane();

        //define the commands

        control.setButton1(new BicycleOn(bike));
        control.setButton2(new BicycleBrake(bike));
        control.setButton3(new BicycleOff(bike));

        control.setButton4(new BoatOn(boat));
        control.setButton5(new BoatBrake(boat));
        control.setButton6(new BoatOff(boat));

        control.setButton7(new CarOn(car));
        control.setButton8(new CarBrake(car));
        control.setButton9(new CarOff(car));

        control.setButton10(new PlaneOn(airForce));
        control.setButton11(new PlaneBrake(airForce));
        control.setButton12(new PlaneOff(airForce));




    }





}
