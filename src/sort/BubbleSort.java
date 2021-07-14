package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {1, 4, 7, 1, -9, 0, 15, 3, 5};
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(bubbleSort(ints)));
    }

    // Нужно отполировать, чтобы небыло двойной работы
    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int buff = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buff;
                }
            }
        }
        return arr;
    }


}
