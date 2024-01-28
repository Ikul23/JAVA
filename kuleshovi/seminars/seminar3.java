package kuleshovi.seminars;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class seminar3 {

    /**
     * Заполнить список  случайными числами
     * отсортировать список методом sort() и вывести его на экран
     * @param args
     */
    static Random random = new Random();
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
    int size = random.nextInt((20) + 10);
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i<size; i++) {
        arrayList.add(random.nextInt(10)-9);
    }
    Collections.sort(arrayList);
    System.out.println(arrayList);
    
    }

}