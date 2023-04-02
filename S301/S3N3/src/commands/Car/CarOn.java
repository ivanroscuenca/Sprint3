package commands.Car;
import commands.Command;
import vehicles.Car;
//object to use


public class CarOn implements Command {
Car car;

    public CarOn(Car car) {
        this.car = car;
    }

    public void execute(){
        car.start();
    }
}

