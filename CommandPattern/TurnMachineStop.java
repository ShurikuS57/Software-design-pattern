package CommandPattern;


public class TurnMachineStop implements Command{

    private Machine mMachine;

    public TurnMachineStop(Machine mMachine) {
        this.mMachine = mMachine;
    }

    @Override
    public void execute() {
        mMachine.stop();
    }

    @Override
    public void undo() {
        mMachine.start();
    }
}
