package Com.Company;

import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(5,6);
        l1.add(6,3);
        l1.addAll(l2);
        //l1.clear();
        System.out.println(l1.contains(8));
        System.out.println(l1.indexOf(3));
        System.out.println(l1.lastIndexOf(3));
        l1.set(1,60);
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
