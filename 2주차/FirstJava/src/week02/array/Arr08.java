package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 1};

        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);
    }
}
