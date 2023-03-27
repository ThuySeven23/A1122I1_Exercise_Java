package dsa_stack_queue.dem_so_lan_xuat_hien_moi_tu_trong_mot_chuoi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordInStringMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> wordCounts = new HashMap<>();

        System.out.print("Nhập chuỗi: "); String str = sc.nextLine();
        String[] words = str.split(" ");

        for (String word : words) {
            if (wordCounts.containsKey(word)){
                wordCounts.put(word , wordCounts.get(word) + 1);
            }else {
                wordCounts.put(word , 1);
            }
        }

        System.out.println("Số lần xuất hiện mỗi từ: ");
        for (String word : wordCounts.keySet()) {
            System.out.print(word + " : " + wordCounts.get(word) + "\n");
        }



    }
}
