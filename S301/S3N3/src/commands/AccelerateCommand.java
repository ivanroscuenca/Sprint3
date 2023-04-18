
package commands;

import Interfaces.Command;
import Interfaces.Vehicle;

public class AccelerateCommand implements Command {
    private final Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }

}