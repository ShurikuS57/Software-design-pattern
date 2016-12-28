package AdapterPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class AnalogToDigitAdapter implements DigitSignal {

    private AnalogSignal analogSignal;

    public AnalogToDigitAdapter(AnalogSignal analogSignal) {
        this.analogSignal = analogSignal;
    }

    @Override
    public byte[] getDigit() {
        float[] analogData = analogSignal.getAnalog();
        byte[] digitData = new byte[analogData.length];

        for (int i = 0; i < analogData.length; i++) {
            digitData[i] = floatToByte(analogData[i]);
        }
        return digitData;
    }

    @Override
    public void setDigit(byte[] digitData) {

    }

    @Override
    public void printDigitData() {
        System.out.println("Digit data: " + Arrays.toString(getDigit()));
    }

    private byte floatToByte(float f) {
        return (byte) (f >= 1 ? 1 : 0);
    }
}
