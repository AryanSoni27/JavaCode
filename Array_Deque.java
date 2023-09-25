package Com.Company;
import java.util.*;
public class Array_Deque<I extends Number> {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(7);
        ad1.add(8);
        ad1.addFirst(5);
        ad1.addLast(9);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.contains(10));
    }
}
