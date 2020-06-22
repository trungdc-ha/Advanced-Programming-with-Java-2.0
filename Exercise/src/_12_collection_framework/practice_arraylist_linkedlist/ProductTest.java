package _12_collection_framework.practice_arraylist_linkedlist;

import java.util.Collections;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager pManager = new ProductManager();
        pManager.addProduct(new Product(1, "A", 4500));
        pManager.addProduct(new Product(2, "B", 1000));
        pManager.addProduct(new Product(3, "C", 5500));
        pManager.addProduct(new Product(4, "D", 20500));
        pManager.addProduct(new Product(5, "E", 5000));
        pManager.addProduct(new Product(6, "F", 3500));

        pManager.displayListProduct();
        pManager.removeProduct(4);
        pManager.displayListProduct();

        System.out.println("Search product 'B': ");
        System.out.println(pManager.findProductByName("B"));

        System.out.println("Sort product by cost: ");
        ProductComparator productComparator = new ProductComparator();

        Collections.sort(pManager.getListOfProducts(), productComparator);
        pManager.displayListProduct();

        System.out.println("Sort product by name: ");

        Collections.sort(pManager.getListOfProducts());
        pManager.displayListProduct();

        System.out.println("Edit product:");
        pManager.editProduct(3);
        pManager.displayListProduct();
    }
}
