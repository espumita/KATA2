package javaapplication1;

public class JavaApplication1 {  
    public static void main(String[] args) {
        Integer[] array = {1,2,4,5,2,5,2,234,2,32,3,23,2-213,12};
        String[] array2 = {"Ana","Juan","Pedro","Luis","Luis","Ana"};

        Histogram <Integer> histogram = CalculaHistogram.computeHisto(array);
        for (Object key: histogram.keySet()) System.out.println(key+" : "+histogram.get(key)+" veces");
    }
}
