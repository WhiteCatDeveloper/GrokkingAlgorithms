package sort.recursion;

import java.util.Arrays;

public class FastSort {
    public static void main(String[] args) {
        int[] ints = new int[12];

        for (int i = 0; i < ints.length; i++) {
            ints[i] =(int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(ints));
    }

    private static int[] fastSort(int[] arr) {
        if (arr.length < 2) return arr;
        else {
            //опорный элемент
            int pivot = arr[0];
            //подмассив всех элементов меньше опорного
            int[] less =
            //подмассив элементов больше опорного
            int[] greater =
            //надо как то сложить их)) и передать в рекурсивный вызов дальше
            return fastSort(less + pivot + greater);
        }
    }
}
