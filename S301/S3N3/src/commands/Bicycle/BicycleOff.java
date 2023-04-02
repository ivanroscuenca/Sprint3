package commands.Bicycle;
import commands.Command;
import vehicles.Bicycle;
//object to use


public class BicycleOff implements Command {
Bicycle bicycle;

    public BicycleOff(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void execute(){
        bicycle.stop();
    }
}


