import java.util.Arrays;

public class QuickSortExample {

    public static int initialSort(int[] array, int firstIndex, int lastIndex) {
        int pivot = array[lastIndex];
        int i = firstIndex - 1;
        for (int j = firstIndex; j <= lastIndex - 1; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, lastIndex);
        return i + 1;
    }

    public static void quickSort(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int point = initialSort(array, firstIndex, lastIndex);
            quickSort(array, firstIndex, point - 1);
            quickSort(array, point + 1, lastIndex);
        }

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void main(String[] args) {
        int[] array = {10, 80, 30, 90, 40, 50, 70};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

}
