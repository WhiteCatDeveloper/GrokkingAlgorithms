package speedtest;

import sort.BubbleSort;

import java.util.Arrays;

public class SpeedTestForSort {
    /** Для замера скорти удобно использовать конструкцию
        long currentTime = System.currentTimeMillis();
        ВЫПОЛНЯЕМЫЙ МЕТОД
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (endTime - currentTime) + "мс.");

        Так же можно использовать System.nanoTime()
        НО! Измерения очень приблизительные и дают только общую картину для сравнений
     */

    public static void main(String[] args) {
        //Тестовый массив для сортировки из 10000 элементов
        int[] ints = new int[10000];
        for (int i = 0; i < ints.length; i++) {
            ints[i] =(int) (Math.random() * 1000);
        }
        long currentTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(ints)));
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (endTime - currentTime) + "мс.");
    }
}
