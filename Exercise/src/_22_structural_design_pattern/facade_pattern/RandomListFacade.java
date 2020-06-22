package _22_structural_design_pattern.facade_pattern;

import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private int max, min, size;

    public RandomListFacade(int max, int min, int size) {
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
        randomList = new RandomList();
        this.max = max;
        this.min = min;
        this.size = size;
    }

    public void printRandomEvenList() {
        List<Integer> listInteger = randomList.generateList(size, min, max);
        List<Integer> listEven = listFilter.filterOdd(listInteger);
        listPrinter.printList(listEven);
    }
}
