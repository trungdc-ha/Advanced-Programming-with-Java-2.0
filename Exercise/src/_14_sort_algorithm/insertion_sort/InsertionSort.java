package _14_sort_algorithm.insertion_sort;

public class InsertionSort {
    private static void insertionSort(double[] list) {
        int n = list.length;
        for (int i = 0; i < n; i++) {
            double key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        double[] list = {0, 10, 4.5, 1.1, 3.2, -8.5};
        insertionSort(list);
        for (double v : list) {
            System.out.println(v + " ");
        }
    }
}
