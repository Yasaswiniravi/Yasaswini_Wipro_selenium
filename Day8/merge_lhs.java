package Assignment8;
import java.util.*;
public class merge_lhs{
    public static void main(String[] args){
        LinkedHashSet<Integer> set1=new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        LinkedHashSet<Integer> set2=new LinkedHashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set1.addAll(set2);
        System.out.println("Merged LinkedHashSet:"+set1);
    }
}
