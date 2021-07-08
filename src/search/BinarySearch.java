package search;

// Что тут происходит?)) РАЗБЕРИСЬ
// тут как то затесался поиск суммы массива

public class BinarySearch {
    public static void main(String[] args) {

        int[] ints = new int[5];

        for (int i = 0; i < ints.length; i++) {
            ints[i] =(int) (Math.random() * 10);
        }

        for (int i :ints) {
            System.out.println(i);
        }

        System.out.println(sum(ints));


    }

    public static int binarySearch (int[] array, int item) {
        int low = 0;
        int high = array.length - 1;
        int result = -1;
        int count = 0;
        while (low <= high) {
            count++;
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
        System.out.println(count);
        return result;
    }


    public static int sum (int[] i) {
        if (i.length == 1) return i[0];
        return i[0] + sum(minusArr(i));
    }

    public static int[] minusArr (int[] i) {
        int[] result = new int[i.length - 1];
        for (int j = 0; j < result.length; j++) {
            result[j] = i[j + 1];
        }
        return result;
    }
}
