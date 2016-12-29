package IteratorPattern;

import java.util.ArrayList;

public class DigitSignal implements Iterator {

    private ArrayList<Integer> data;
    private int position = 0;

    public DigitSignal(ArrayList<Integer> data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        if(position >= data.size()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        int item = data.get(position);
        position++;
        return item;
    }
}
