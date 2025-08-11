package Assignment8;
import java.util.*;
public class doubleendeddorder{
    public static void main(String[] args){
        Deque<String> dq=new ArrayDeque<>();
        dq.addFirst("A");
        dq.addLast("B");
        System.out.println(dq);
        dq.addFirst("C");
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
}
