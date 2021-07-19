package speedtest;

import java.util.Arrays;

import static search.BinarySearch.binarySearch;

/**
 * Эксперименты с нано временем и статическим импортом)
 */

public class SpeedTestForSearch {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] =(int) (Math.random() * 10);
        }
        Arrays.sort(ints);
        int item = 5;

        System.out.println("Позиция числа 5: " + (binarySearch(ints, item)));
        long endTime = System.nanoTime();
        System.out.println("Поиск занял: " + (endTime - startTime) + "нс");
    }
}
