package IteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        float[] analogData = {0.3f, 1.5f, 2.0f, 0.99f, 1f};
        ArrayList<Integer> digitData = new ArrayList<>();
        digitData.add(1);
        digitData.add(0);
        digitData.add(0);
        digitData.add(1);

        Iterator analogIterator = new AnalogSignal(analogData);
        printIterator(analogIterator);

        Iterator digitalIterator = new DigitSignal(digitData);
        printIterator(digitalIterator);
    }

    private static void printIterator(Iterator iterator){
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
}
