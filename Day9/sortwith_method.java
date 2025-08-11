package assignment9;

import java.util.*;
class Emp{
    String name;
    double salary;
    Emp(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
        return name + " " + salary;
    }
}
public class sortwith_method{
    public static void main(String[] args){
        List<Emp> list = new ArrayList<>();
        list.add(new Emp("Ravi", 50000));
        list.add(new Emp("Priya", 60000));
        list.add(new Emp("Amit", 55000));
        
        System.out.println("Sort by name:");
        list.sort(Comparator.comparing(Emp::getName));
        list.forEach(System.out::println);
        
        System.out.println("Sort by salary:");
        list.sort(Comparator.comparingDouble(Emp::getSalary));
        list.forEach(System.out::println);
    }
}

