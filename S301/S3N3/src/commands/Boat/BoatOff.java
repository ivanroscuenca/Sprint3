package commands.Boat;
import commands.Command;
import vehicles.Boat;
//object to use


public class BoatOff implements Command {
Boat boat;

    public BoatOff(Boat boat) {
        this.boat = boat;
    }

    public void execute(){
        boat.stop();
    }
}


