package week02.collection;

import java.util.LinkedList;

public class Col2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(3);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList);

        linkedList.add(200);
        System.out.println(linkedList);

        linkedList.add(2, 4);
        System.out.println(linkedList);

        linkedList.set(1, 30);
        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList);
    }
}
