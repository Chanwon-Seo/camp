package week02.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(1));

        intList.set(1, 10);
        System.out.println(intList.get(1));

        intList.remove(0);
        System.out.println(intList.get(0));

        intList.clear();

        System.out.println(intList);
    }
}
