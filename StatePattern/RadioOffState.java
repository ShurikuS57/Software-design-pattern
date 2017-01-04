package StatePattern;

public class RadioOffState implements State {

    @Override
    public void actionState() {
        System.out.println("Radio is turned OFF");
    }
}
