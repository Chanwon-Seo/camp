package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stringArr = {"a", "b", "c", "d"};

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }

        for (int i : intArr) {
            System.out.println(i);
        }

        Arrays.fill(intArr, 1);

        for (int i : intArr) {
            System.out.println(i);
        }
    }
}
