package StatePattern;

public class Main {

    public static void main(String[] args) {
        Radio radio = new Radio();
        State radioOnState = new RadioOnState();
        State radioOffState = new RadioOffState();

        radio.setRadioState(radioOnState);
        radio.actionState();

        radio.setRadioState(radioOffState);
        radio.actionState();
    }

}
