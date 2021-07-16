package sort.recursion;

import java.util.Arrays;

/**
 * Взято на просторах интернета
 */

public class FastSort {
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    //ТУТ НАЧИНАЕТСЯ ПОПЫТКА МОЕЙ РЕАЛИЗАЦИИ

    //    private static int[] fastSort(int[] arr) {
//        // базовый случай. если массив меньше двух элементов, возвращаем его, если два, сортируем
//        if (arr.length < 2) return arr;
//        else if (arr.length == 2) {
//            if (arr[0] < arr[1]) {
//                return arr;
//            } else {
//                return new int[] {arr[1], arr[0]};
//            }
//        }
//        // рекурсивный случай
//        else {
//            //опорный элемент. Лучше
//            int pivot = arr[arr.length / 2];
//            //подмассив всех элементов меньше опорного
//            int[] less =
//            //подмассив элементов больше опорного
//            int[] greater =
//            //надо как то сложить их)) и передать в рекурсивный вызов дальше
//            return fastSort(less) + pivot + fastSort(greater);
//        }
//    }
}
