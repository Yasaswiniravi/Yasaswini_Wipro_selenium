package assignment7;
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
public class objdemo {
    public static void changeName(Person p) {
        p.name = "Alice"; 
        System.out.println("Inside method: name = " + p.name);
    }
    public static void main(String[] args) {
        Person person = new Person("Bob");
        System.out.println("Before method call: name = " + person.name);
        changeName(person);
        System.out.println("After method call: name = " + person.name);
    }
}
