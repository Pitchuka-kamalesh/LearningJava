package org.example;
import java.util.ArrayList;
import java.util.List;
public class fibanocieSerices {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
// add method for integer ArrayList
        list.add(1);
        list.add(2);
        long start = System.nanoTime();
        for (int i = 0; i < 15; i++) {

            list.add(list.get(list.size()-1)+list.get(list.size()-2));

        }
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");

        for (Integer integer : list) {
            System.out.println(integer);
        }



    }
}
