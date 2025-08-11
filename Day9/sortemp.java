package assignment9;

import java.util.*;
class Employee implements Comparable<Employee>{
    String name;
    int id;
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    public int compareTo(Employee e){
        return this.name.compareTo(e.name);
    }
    public String toString(){
        return id+" "+name;
    }
}
public class sortemp{
    public static void main(String[] args){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Ravi",101));
        employees.add(new Employee("Priya",102));
        employees.add(new Employee("Amit",103));
        Collections.sort(employees);
        for(Employee e:employees)
            System.out.println(e);
    }
}

