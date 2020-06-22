package _22_structural_design_pattern.adapter_pattern;

import java.util.Set;

public class CollectionUtil {
    private CollectionOperations collectionOperations;

    public CollectionUtil(CollectionOperations collectionOperations) {
        this.collectionOperations = collectionOperations;
    }

    public void printMaxValue(Set<Integer> numbers){
        int max = collectionOperations.findMax(numbers);
        System.out.println("Max value is: " + max);
    }

    public void printList(Set<Integer> numbers) {
        System.out.println("Print List: ");
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }
    }
}
