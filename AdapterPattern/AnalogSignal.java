package AdapterPattern;


public interface AnalogSignal {

    float[] getAnalog();

    void setAnalog(float[] analogData);

    void printAnalogData();
}
