import Interfaces.Command;
import commands.AccelerateCommand;
import commands.BrakeCommand;
import commands.StartCommand;
import vehicles.Bicycle;
import vehicles.Boat;
import vehicles.Car;
import vehicles.Plane;
import Pilot.*;

public class Parking {
    public static void main(String[] args) {

        // Create the vehicles
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Plane plane = new Plane();
        Boat boat = new Boat();

        // Create the commands
        Command carStartCommand = new StartCommand(car);
        Command carAccelerateCommand = new AccelerateCommand(car);
        Command carBrakeCommand = new BrakeCommand(car);

        Command bicycleStartCommand = new StartCommand(bicycle);
        Command bicycleAccelerateCommand = new AccelerateCommand(bicycle);
        Command bicycleBrakeCommand = new BrakeCommand(bicycle);

        Command planeStartCommand = new StartCommand(plane);
        Command planeAccelerateCommand = new AccelerateCommand(plane);
        Command planeBrakeCommand = new BrakeCommand(plane);

        Command boatStartCommand = new StartCommand(boat);
        Command boatAccelerateCommand = new AccelerateCommand(boat);
        Command boatBrakeCommand = new BrakeCommand(boat);

        //instance of pilots

        Pilot pilot1 = new Pilot();
        Pilot pilot2 = new Pilot();
        Pilot pilot3 = new Pilot();
        Pilot pilot4 = new Pilot();

        // Add commands to the pilots

        pilot1.addCommand(carStartCommand);
        pilot1.addCommand(carAccelerateCommand);
        pilot1.addCommand(carBrakeCommand);

        pilot2.addCommand(bicycleStartCommand);
        pilot2.addCommand(bicycleAccelerateCommand);
        pilot2.addCommand(bicycleBrakeCommand);

        pilot3.addCommand(planeStartCommand);
        pilot3.addCommand(planeAccelerateCommand);
        pilot3.addCommand(planeBrakeCommand);

        pilot4.addCommand(boatStartCommand);
        pilot4.addCommand(boatAccelerateCommand);
        pilot4.addCommand(boatBrakeCommand);

        //execute commands

        pilot1.executeCommands();
        pilot2.executeCommands();
        pilot3.executeCommands();
        pilot4.executeCommands();









    }
}