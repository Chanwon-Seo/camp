package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        //HashSet, TreeSet
        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer i : intSet) {
            System.out.println(i);
        }

        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));
    }
}
