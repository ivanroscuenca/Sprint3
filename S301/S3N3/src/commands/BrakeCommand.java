
package commands;

import Interfaces.Command;
import Interfaces.Vehicle;

public class BrakeCommand implements Command {
    private final Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }

}