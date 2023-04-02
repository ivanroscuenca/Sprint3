package commands.Boat;
import commands.Command;
import vehicles.Boat;
//object to use


public class BoatBrake implements Command {
Boat boat;

    public BoatBrake(Boat boat) {
        this.boat = boat;
    }

    public void execute(){
        boat.brake();
    }
}


