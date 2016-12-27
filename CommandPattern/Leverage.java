package CommandPattern;

public class Leverage {

    private Command mCommand;

    public Leverage(Command command) {
        this.mCommand = command;
    }

    public void pull(){
        mCommand.execute();
    }
}
