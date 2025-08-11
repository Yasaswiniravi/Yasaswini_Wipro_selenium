package Assignment8;

import java.util.*;
class Studente{
    int id;
    String name;
    Studente(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int hashCode(){
        return Objects.hash(id,name);
    }
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(!(obj instanceof Studente))return false;
        Studente s=(Studente)obj;
        return id==s.id&&name.equals(s.name);
    }
    public String toString(){
        return id+"-"+name;
    }
}
public class lhs_custom{
    public static void main(String[] args){
        LinkedHashSet<Studente> students=new LinkedHashSet<>();
        students.add(new Studente(1,"Ravi"));
        students.add(new Studente(2,"Priya"));
        students.add(new Studente(3,"Amit"));
        students.add(new Studente(1,"Ravi"));
        System.out.println("Students in LinkedHashSet:"+students);
    }
}

