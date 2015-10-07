package javaapplication1;

import java.util.HashMap;

public class Historgram {

    private final int[] array;

    public Historgram(int[] array) {
        this.array = array;
    }

    public HashMap<Integer, Integer> getHisto() {
        HashMap<Integer, Integer> histo = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!histo.containsKey(array[i])) {
                histo.put(array[i], 0);
            }
            histo.put(array[i], histo.get(array[i]) + 1);
        }
        return histo;

    }
}