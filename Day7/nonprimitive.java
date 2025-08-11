package assignment7;
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
public class nonprimitive {
    public static void changeName(Person p) {
        p.name = "Alice"; 
    }
    public static void main(String[] args) {
        Person person = new Person("Bob");
        changeName(person);
        System.out.println("After method call, name = " + person.name);  
    }
}