package Assignment8;

import java.util.*;
public class hashsetops {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("Bangalore");
        cities.remove("Chennai");
        System.out.println("Contains Mumbai? " + cities.contains("Mumbai"));
        cities.clear();
        System.out.println("HashSet after clear: " + cities);
    }
}

