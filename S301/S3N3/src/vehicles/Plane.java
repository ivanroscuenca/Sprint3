package vehicles;
import Interfaces.Vehicle;
public class Plane implements Vehicle {

    public void start(){
        System.out.println("plane is started");
    }

    public void accelerate(){
        System.out.println("plane is speeding up");
    }

    public void brake(){
        System.out.println("plane is braked");
    }
}
