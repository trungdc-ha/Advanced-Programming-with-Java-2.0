package _11_stack_queue.count_character;

import java.util.*;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String str = scanner.nextLine();

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String character;
        for (int i = 0; i < str.length(); i++) {
            character = String.valueOf(str.charAt(i)).toLowerCase();
            if (treeMap.containsKey(character)) {
                treeMap.put(character, treeMap.get(character) + 1);
            } else {
                treeMap.put(character, 1);
            }
        }

        System.out.println(treeMap);

        //Sử dụng Map.Entry interface - duyệt các phần tử của TreeMap
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //Sử dụng vòng lặp for - duyệt các phần tử của TreeMap
        Set<String> keySet = treeMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " - " + treeMap.get(key));
        }

        //Sử dụng Iterator - duyệt các phần tử của TreeMap
        Iterator<String> itr = treeMap.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println(key + " - " + treeMap.get(key));
        }

    }
}
