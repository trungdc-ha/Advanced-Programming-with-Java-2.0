package _14_sort_algorithm.selection_sort;

public class SelectionSort {
    private static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double min = list[i];
            int indexMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    indexMin = j;
                }
            }

            if (indexMin != i) {
                list[indexMin] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {0, 10, 4.5, 1.1, 3.2, -8.5};
        SelectionSort.selectionSort(list);
        for (double v : list) {
            System.out.println(v + " ");
        }
    }
}
