package APCS;

import java.util.ArrayList;

public class TestBed {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);

        numbers.remove(0);

        System.out.print(numbers.size());
    }
}