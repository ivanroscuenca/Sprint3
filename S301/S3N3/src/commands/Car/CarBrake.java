package commands.Car;
import commands.Command;
import vehicles.Car;
//object to use


public class CarBrake implements Command {
Car car;

    public CarBrake(Car car) {
        this.car = car;
    }

    public void execute(){
        car.brake();
    }
}


