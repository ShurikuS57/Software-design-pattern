package AdapterPattern;

import java.util.Arrays;

public class AnalogWeb implements AnalogSignal {

    private float[] data;

    public AnalogWeb(float[] data) {
        this.data = data;
    }

    @Override
    public float[] getAnalog() {
        return data;
    }

    @Override
    public void setAnalog(float[] analogData) {
        this.data = analogData;
    }

    @Override
    public void printAnalogData() {
        System.out.println("Analog signal: " + Arrays.toString(data));
    }
}
