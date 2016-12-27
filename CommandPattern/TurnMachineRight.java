package CommandPattern;


public class TurnMachineRight implements Command{

    private Machine mMachine;

    public TurnMachineRight(Machine mMachine) {
        this.mMachine = mMachine;
    }

    @Override
    public void execute() {
        mMachine.turnRight();
    }

    @Override
    public void undo() {
        mMachine.straightLine();
    }
}
