package assignment7;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
public class callbyvaluedemo {
    public static void changeReference(Person p) {
        p = new Person("Charlie"); // Reassign p to a new object
        System.out.println("Inside method: p.name = " + p.name);
    }
    public static void main(String[] args) {
        Person person = new Person("Bob");
        System.out.println("Before method call: person.name = " + person.name);
        changeReference(person);
        System.out.println("After method call: person.name = " + person.name);
    }
}
