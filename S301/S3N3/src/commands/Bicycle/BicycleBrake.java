package commands.Bicycle;
import commands.Command;
import vehicles.Bicycle;
//object to use


public class BicycleBrake implements Command {
Bicycle bicycle;

    public BicycleBrake(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void execute(){
        bicycle.brake();
    }
}


