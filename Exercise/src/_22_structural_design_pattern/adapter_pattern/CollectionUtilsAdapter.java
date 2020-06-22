package _22_structural_design_pattern.adapter_pattern;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter {
    private CollectionUtil util;

    public void CollectionUtilAdapter() {
        CollectionOperations demoOperation = new CollectionOperations() {
            @Override
            public int findMax(Set<Integer> numbers) {
                int max = 0;
                for (int number : numbers) {
                    if (number > max) {
                        max = number;
                    }
                }
                return max;
            }
        };
        util = new CollectionUtil(demoOperation);
    }

    public void printMaxValue(List<Integer> numbers) {
        Set<Integer> setNumbers = new HashSet<>(numbers);
        util.printMaxValue(setNumbers);
    }

    public void printList(List<Integer> numbers) {
        Set<Integer> setNumbers = new HashSet<>(numbers);
        util.printList(setNumbers);
    }
}
