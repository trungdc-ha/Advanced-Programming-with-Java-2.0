package _22_structural_design_pattern.facade_pattern;

public class Main {

    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade(50, 5, 100);
        randomListFacade.printRandomEvenList();
    }
}
