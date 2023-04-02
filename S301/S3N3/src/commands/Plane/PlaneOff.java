package commands.Plane;
import commands.Command;
import vehicles.Plane;
//object to use


public class PlaneOff implements Command {
Plane plane;

    public PlaneOff(Plane plane) {
        this.plane = plane;
    }

    public void execute(){
        plane.stop();
    }
}


