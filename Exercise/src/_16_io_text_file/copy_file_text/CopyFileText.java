package _16_io_text_file.copy_file_text;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyFileText {
    public static void writeFile(FileWriter fw, String str) {
        try {
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Write success");
    }

    public static String readFile(FileReader fr) throws Exception {
        int i;
        String result = "";
        while ((i = fr.read()) != -1) {
            result += (char) i;
        }
        fr.close();
        return result;
    }

    public static void main(String[] args) throws Exception {
        String result = readFile(new FileReader("D:\\input.txt"));
        writeFile(new FileWriter("D:\\output.txt"), result);

    }
}
