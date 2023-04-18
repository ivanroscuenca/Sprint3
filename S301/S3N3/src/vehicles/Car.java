package vehicles;
import Interfaces.Vehicle;
public class Car implements Vehicle {

    public void start(){
        System.out.println("car is started");
    }

    public void accelerate(){
        System.out.println("car is speeding up");
    }

    public void brake(){
        System.out.println("car is braked");
    }
}

