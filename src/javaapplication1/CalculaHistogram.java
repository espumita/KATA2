package javaapplication1;

public class CalculaHistogram {
    public static <T> Histogram<T> computeHisto(T[] array){
        Histogram<T> histo = new Histogram<>();
        for (T key : array) histo.increment(key);
        return histo;
    } 
}
