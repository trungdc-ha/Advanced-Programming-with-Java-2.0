package ex_generics;


public class MethodGenerics {

    private <T> void displayValue(T[] e){
        for (T element:e){
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        Integer[] myInt = {1,2,3,4,5};
        String[] myStr = {"A","B","C"};
        Double[] myDouble = {1.1,1.2,1.3};

        MethodGenerics test = new MethodGenerics();
        test.displayValue(myInt);
        test.displayValue(myStr);
        test.displayValue(myDouble);

    }
}
