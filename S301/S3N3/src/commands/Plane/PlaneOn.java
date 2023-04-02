package commands.Plane;
import commands.Command;
import vehicles.Plane;
//object to use


public class PlaneOn implements Command {
Plane plane;

    public PlaneOn(Plane plane) {
        this.plane = plane;
    }

    public void execute(){
        plane.start();
    }
}

