package other;


public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        System.out.println(sumArr(arr, 0));



    }
    // метод для нахождения суммы массива чисел с использованием рекурсии
    private static int sumArr(int[] arr, int sum) {

        if (arr.length == 0) return 0;

        if (arr.length == 1) {
            sum += arr[0];
        }  else {
            sum += arr[0];
            sumArr(minusItemInArr(arr), sum);
        }
        return sum;
    }

    private static int[] minusItemInArr (int[] arr) {
        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 1, result, 0 , arr.length - 1);
        return result;
    }
}
