package AdapterPattern;

public class Main {

    public static void main(String[] args) {
        float[] analogData = {0.3f, 1.5f, 2.0f, 0.99f, 1f};
        byte[] digitData = {1, 0, 1, 1,0};

        AnalogSignal analogSignal = new AnalogWeb(analogData);
        analogSignal.printAnalogData();

        DigitSignal digitSignal = new DigitWeb(digitData);
        digitSignal.printDigitData();

        DigitSignal atda = new AnalogToDigitAdapter(analogSignal);
        atda.printDigitData();

    }
}
