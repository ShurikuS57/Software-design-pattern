package StatePattern;

public class Radio implements State {

    private State radioState;

    public State getRadioState() {
        return radioState;
    }

    public void setRadioState(State radioState) {
        this.radioState = radioState;
    }

    @Override
    public void actionState() {
        this.radioState.actionState();
    }
}
