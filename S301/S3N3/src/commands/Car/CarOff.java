package commands.Car;
import commands.Command;
import vehicles.Car;
//object to use


public class CarOff implements Command {
Car car;

    public CarOff(Car car) {
        this.car = car;
    }

    public void execute(){
        car.stop();
    }
}


