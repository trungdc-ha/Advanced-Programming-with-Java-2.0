package _17_io_binary_file_serialization.product_manage;

import java.io.*;

public class ProductManagement {
    public static void main(String[] args) {
        try {
            String path = "D:\\Work\\CodeGym\\Module_2\\Exercise\\src\\_17_io_binary_file_serialization\\product.txt";

            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(path));
            dataOutputStream.writeUTF("Product ID,Product name,Manufacturer,Price");
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(path));

            String line = null;
            while (dataInputStream.available() > 0) {
                line = dataInputStream.readUTF();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
