package AdapterPattern;

import java.util.Arrays;

public class DigitWeb implements DigitSignal{

    private byte[] data;

    public DigitWeb(byte[] data) {
        this.data = data;
    }

    @Override
    public byte[] getDigit() {
        return data;
    }

    @Override
    public void setDigit(byte[] digitData) {
        this.data = digitData;
    }

    @Override
    public void printDigitData() {
        System.out.println("Digit data: " + Arrays.toString(data));
    }
}
