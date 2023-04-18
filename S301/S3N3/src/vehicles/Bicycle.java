package vehicles;

import Interfaces.Vehicle;

public class Bicycle implements Vehicle {

    public void start(){
        System.out.println("bicycle is started");
    }

    public void accelerate(){
        System.out.println("bicycle is speeding up");
    }

    public void brake(){
        System.out.println("bicycle is braked");
    }
}
