package assignment9;

import java.util.*;
class Studentt{
    String name;
    double marks;
    Studentt(String name,double marks){
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return name+" "+marks;
    }
}
public class sortstudbymarks{
    public static void main(String[] args){
        List<Studentt> students=new ArrayList<>();
        students.add(new Studentt("Ravi",85.5));
        students.add(new Studentt("Priya",90.0));
        students.add(new Studentt("Amit",78.0));
        students.sort((s1,s2) -> Double.compare(s2.marks,s1.marks));
        for(Studentt s:students)
            System.out.println(s);
    }
}