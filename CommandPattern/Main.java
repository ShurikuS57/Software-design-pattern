package CommandPattern;

public class Main {

    public static void main(String[] args) {
        Machine car = new Car();

        Command commandStartCar = new TurnMachineStart(car);
        Command commandStopCar = new TurnMachineStop(car);
        Command commandLeftCar = new TurnMachineLeft(car);
        Command commandRightCar = new TurnMachineRight(car);

        Leverage leverage = new Leverage(commandStartCar);
        leverage.pull();

        leverage = new Leverage(commandLeftCar);
        leverage.pull();

        leverage = new Leverage(commandRightCar);
        leverage.pull();

        commandRightCar.undo();

        leverage = new Leverage(commandStopCar);
        leverage.pull();


        //-------------------------------------------------

        Machine aircraft = new Aircraft();

        Command commandStartAircraft = new TurnMachineStart(aircraft);
        Command commandStopAircraft = new TurnMachineStop(aircraft);
        Command commandLeftAircraft = new TurnMachineLeft(aircraft);
        Command commandRightAircraft = new TurnMachineRight(aircraft);

        Leverage leverageAircraft = new Leverage(commandStartAircraft);
        leverageAircraft.pull();

        leverage = new Leverage(commandLeftAircraft);
        leverage.pull();

        leverage = new Leverage(commandRightAircraft);
        leverage.pull();

        leverage = new Leverage(commandStopAircraft);
        leverage.pull();

        commandStopAircraft.undo();

    }
}
