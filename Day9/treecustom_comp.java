package assignment9;

import java.util.*;
class Person7{
    String name;
    int age;
    Person7(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + " " + age;
    }
}
public class treecustom_comp{
    public static void main(String[] args){
        Comparator<Person7> ageComparator = new Comparator<Person7>(){
            public int compare(Person7 p1, Person7 p2){
                return p1.age - p2.age;
            }
        };
        TreeSet<Person7> persons = new TreeSet<>(ageComparator);
        persons.add(new Person7("Ravi", 25));
        persons.add(new Person7("Priya", 30));
        persons.add(new Person7("Amit", 22));
        for(Person7 p : persons)
            System.out.println(p);
    }
}