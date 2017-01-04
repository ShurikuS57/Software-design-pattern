package StatePattern;

public class RadioOnState implements State {

    @Override
    public void actionState() {
        System.out.println("Radio is turned ON");
    }
}
