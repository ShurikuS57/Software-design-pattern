package IteratorPattern;

import java.util.Arrays;

public class AnalogSignal implements Iterator {

    private float[] data;
    private int position  = 0;

    public AnalogSignal(float[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        if(position >= data.length){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        float item = data[position];
        position++;
        return item;
    }
}
