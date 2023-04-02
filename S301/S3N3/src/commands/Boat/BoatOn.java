package commands.Boat;
import commands.Command;
import vehicles.Boat;
//object to use


public class BoatOn implements Command {
Boat boat;

    public BoatOn(Boat boat) {
        this.boat = boat;
    }

    public void execute(){
        boat.start();
    }
}

