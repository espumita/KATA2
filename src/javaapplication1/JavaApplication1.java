package javaapplication1;

import java.util.HashMap;

public class JavaApplication1 {
    
    
    public static void main(String[] args) {
        int[] array = {1,2,4,5,2,5,2,234,2,32,3,23,2-213,12};
        String[] array2 = {"Ana","Juan","Pedro","Luis","Luis","Ana"};
        Historgram histogram = new Historgram(array2);
        HashMap<Object,Integer> histo = histogram.getHisto();
        for (Object key: histo.keySet()){
            System.out.println(key+" : "+histo.get(key)+" veces");
        }
    }
}
