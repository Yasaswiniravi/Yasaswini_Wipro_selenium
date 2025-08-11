package Assignment8;

import java.util.*;
public class treesetint{
    public static void main(String[] args){
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        System.out.println("First:"+numbers.first());
        System.out.println("Last:"+numbers.last());
        System.out.println("Lower than 15:"+numbers.lower(15));
        System.out.println("Higher than 15:"+numbers.higher(15));
    }
}

