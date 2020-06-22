package _22_structural_design_pattern.adapter_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
        int count = 0;
        Random random = new Random();
        CollectionUtilsAdapter util = new CollectionUtilsAdapter();
        List<Integer> listNumber = new ArrayList<>();
        while (count < 50) {
            listNumber.add(random.nextInt(10));
            count++;
        }
        util.printList(listNumber);
        util.printMaxValue(listNumber);
    }
}
