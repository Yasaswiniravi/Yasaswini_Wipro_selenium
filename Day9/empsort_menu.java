package assignment9;

import java.util.*;
class Emp1{
    String name, department;
    double salary;
    Emp1(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String toString(){
        return name + " " + department + " " + salary;
    }
}
public class empsort_menu{
    public static void main(String[] args){
        List<Emp1> employees = new ArrayList<>();
        employees.add(new Emp1("Ravi", "IT", 50000));
        employees.add(new Emp1("Priya", "HR", 60000));
        employees.add(new Emp1("Amit", "Finance", 55000));
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\nSort by: 1-Name 2-Salary 3-Department 4-Exit");
            int choice = sc.nextInt();
            if(choice == 4) break;
            switch(choice){
                case 1:
                    employees.sort(Comparator.comparing(e -> e.name));
                    break;
                case 2:
                    employees.sort(Comparator.comparingDouble(e -> e.salary));
                    break;
                case 3:
                    employees.sort(Comparator.comparing(e -> e.department));
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            for(Emp1 e : employees)
                System.out.println(e);
        }
        sc.close();
    }
} 
