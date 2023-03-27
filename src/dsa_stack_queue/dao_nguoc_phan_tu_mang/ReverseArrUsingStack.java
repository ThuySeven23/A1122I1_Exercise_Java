package dsa_stack_queue.dao_nguoc_phan_tu_mang;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrUsingStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int[] arrayFirst = {5,6,7,8,9,10};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arrayFirst));

        for (int i : arrayFirst) {
            stack.push(i);
        }

        int[] arrayLast = new int[arrayFirst.length];
        for (int i = 0; i < arrayLast.length; i++) {
            arrayLast[i] = stack.pop();
        }
        System.out.println("Mảng lúc sau: " + Arrays.toString(arrayLast));

    }
}
