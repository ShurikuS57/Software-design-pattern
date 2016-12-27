package CommandPattern;


public class TurnMachineStart  implements Command{

    private Machine mMachine;

    public TurnMachineStart(Machine mMachine) {
        this.mMachine = mMachine;
    }

    @Override
    public void execute() {
        mMachine.start();
    }

    @Override
    public void undo() {
        mMachine.stop();
    }
}
