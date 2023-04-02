package commands.Bicycle;
import commands.Command;
import vehicles.Bicycle;
//object to use


public class BicycleOn implements Command {
Bicycle bicycle;

    public BicycleOn(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void execute(){
        bicycle.start();
    }
}

