package assignment9;

import java.util.*;
class Studente implements Comparable<Studente>{
    String name;
    double marks;
    Studente(String name,double marks){
        this.name=name;
        this.marks=marks;
    }
    public int compareTo(Studente s){
        return this.name.compareTo(s.name);
    }
    public String toString(){
        return name+" "+marks;
    }
}
public class studsort{
    public static void main(String[] args){
        List<Studente> students=new ArrayList<>();
        students.add(new Studente("Ravi",85.5));
        students.add(new Studente("Priya",90.0));
        students.add(new Studente("Amit",78.0));
        System.out.println("Sort by name:");
        Collections.sort(students);
        for(Studente s:students)
            System.out.println(s);
        System.out.println("Sort by marks:");
        students.sort(Comparator.comparingDouble(s -> s.marks));
        for(Studente s:students)
            System.out.println(s);
    }
}
