package assignment9;

import java.util.*;
import java.time.*;
class Employee5{
    String name;
    LocalDate joiningDate;
    Employee5(String name,LocalDate joiningDate){
        this.name=name;
        this.joiningDate=joiningDate;
    }
    public String toString(){
        return name+" "+joiningDate;
    }
}
public class sortempbydate{
    public static void main(String[] args){
        List<Employee5> employees=new ArrayList<>();
        employees.add(new Employee5("Ravi",LocalDate.of(2022,5,10)));
        employees.add(new Employee5("Priya",LocalDate.of(2020,3,15)));
        employees.add(new Employee5("Amit",LocalDate.of(2021,8,25)));
        employees.sort(Comparator.comparing(e -> e.joiningDate));
        for(Employee5 e:employees)
            System.out.println(e);
    }
}

