package Assignment8;

import java.util.*;
public class treeset_rev{
    public static void main(String[] args){
        TreeSet<String> set=new TreeSet<>(Comparator.reverseOrder());
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        System.out.println(set);
    }
}
