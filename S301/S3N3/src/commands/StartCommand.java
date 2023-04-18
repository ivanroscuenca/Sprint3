package commands;

import Interfaces.Command;
import Interfaces.Vehicle;

public class StartCommand implements Command {
    private final Vehicle vehicle;

    public StartCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }

}

