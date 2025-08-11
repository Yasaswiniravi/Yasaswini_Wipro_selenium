package assignment9;

import java.util.*;
class City{
    String name;
    int population;
    City(String name,int population){
        this.name=name;
        this.population=population;
    }
    public String toString(){
        return name+" "+population;
    }
}
public class sortcitybypopulation{
    public static void main(String[] args){
        List<City> cities=new ArrayList<>();
        cities.add(new City("Mumbai",20000000));
        cities.add(new City("Delhi",18000000));
        cities.add(new City("Bangalore",12000000));
        cities.sort(Comparator.comparingInt(c -> c.population));
        for(City c:cities)
            System.out.println(c);
    }
}

