package other;

// метод для нахождения суммы массива чисел с использованием рекурсии

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        System.out.println(sumArr(arr));
    }

    public static int sumArr (int[] i) {
        if (i.length == 1) return i[0];
        return i[0] + sumArr(minusItemInArr(i));
    }

    // убирает первый элемент в массиве. Точнее возвращает новый массив короче на один элемент
    private static int[] minusItemInArr (int[] arr) {
        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 1, result, 0 , arr.length - 1);
        return result;
    }
}
