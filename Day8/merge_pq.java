package Assignment8;

import java.util.*;
public class merge_pq{
    public static PriorityQueue<Integer> mergeQueues(PriorityQueue<Integer> q1,PriorityQueue<Integer> q2){
        PriorityQueue<Integer> merged=new PriorityQueue<>(q1);
        merged.addAll(q2);
        return merged;
    }
    public static void main(String[] args){
        PriorityQueue<Integer> q1=new PriorityQueue<>(Arrays.asList(1,3,5));
        PriorityQueue<Integer> q2=new PriorityQueue<>(Arrays.asList(2,4,6));
        System.out.println(mergeQueues(q1,q2));
    }
}

