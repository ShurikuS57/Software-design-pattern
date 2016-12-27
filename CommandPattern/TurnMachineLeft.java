package CommandPattern;


public class TurnMachineLeft implements Command{

    private Machine mMachine;

    public TurnMachineLeft(Machine mMachine) {
        this.mMachine = mMachine;
    }

    @Override
    public void execute() {
        mMachine.turnLeft();
    }

    @Override
    public void undo() {
        mMachine.straightLine();
    }
}
