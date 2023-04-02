package commands.Plane;
import commands.Command;
import vehicles.Plane;
//object to use


public class PlaneBrake implements Command {
Plane plane;

    public PlaneBrake(Plane plane) {
        this.plane = plane;
    }

    public void execute(){
        plane.brake();
    }
}


