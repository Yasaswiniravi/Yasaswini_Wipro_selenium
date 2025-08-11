package Assignment8;

import java.util.*;
class Patient{
    String name;
    int severityLevel;
    Patient(String name,int severityLevel){
        this.name=name;
        this.severityLevel=severityLevel;
    }
    public String toString(){
        return name+"("+severityLevel+")";
    }
}
public class hosp_queue{
    public static void main(String[] args){
        PriorityQueue<Patient> pq=new PriorityQueue<>((a,b)->b.severityLevel-a.severityLevel);
        pq.add(new Patient("Alice",5));
        pq.add(new Patient("Bob",2));
        pq.add(new Patient("Charlie",4));
        while(!pq.isEmpty()){
            System.out.println("Serving:"+pq.poll());
        }
    }
}

