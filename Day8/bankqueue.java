package Assignment8;

import java.util.*;
public class bankqueue{
    public static void main(String[] args){
        Queue<String> queue=new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");
        queue.add("Eva");
        while(!queue.isEmpty()){
            System.out.println("Serving:"+queue.poll());
            System.out.println(queue);
        }
    }
}

