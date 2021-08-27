import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortExampleTest {

    @org.junit.jupiter.api.Test
    void quickSort() {
        int[] array = {10, 80, 30, 90, 40, 50, 70};
        int[] actual = {10, 30, 40, 50, 70, 80, 90};
        QuickSortExample.quickSort(array, 0, array.length - 1);
        assertArrayEquals(array, actual);
    }

}