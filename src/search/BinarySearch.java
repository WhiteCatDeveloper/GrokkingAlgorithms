package search;


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] =(int) (Math.random() * 10);
        }
        Arrays.sort(ints);

        for (int i :ints) {
            System.out.println(i);
        }

        int item = 5;

        System.out.println();
        System.out.println("Позиция числа 5: " + (binarySearch(ints, item)));


    }

    public static int binarySearch (int[] array, int item) {
        int low = 0;
        int high = array.length - 1;
        int result = -1;
//        Счетчик итераций поиска
//        int count = 0;
        while (low <= high) {
//            count++;
            int mid = (high + low) / 2;
            if (array[mid] == item) {
                result = mid;
                break;
            } else if (array[mid] > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

//        System.out.println(count);
        return result;
    }



}
