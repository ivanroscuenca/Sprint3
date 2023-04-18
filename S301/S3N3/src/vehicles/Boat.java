package vehicles;

import Interfaces.Vehicle;

public class Boat implements Vehicle {

    public void start(){
        System.out.println("boat is started");
    }

    public void accelerate(){
        System.out.println("boat is speeding up");
    }

    public void brake(){
        System.out.println("boat is braked");
    }

}
