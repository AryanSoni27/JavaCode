package Com.Company;

import java.util.HashSet;

public class hash_set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(10,0.7f);
        myHashSet.add(10);
        myHashSet.add(5);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(2);
        System.out.println(myHashSet);
    }
}
