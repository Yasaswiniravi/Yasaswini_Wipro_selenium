package assignment9;

import java.util.*;
class Item implements Comparable<Item>{
    int id;
    String name;
    Item(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int compareTo(Item other){
        return this.id - other.id;
    }
    public String toString(){
        return id+" "+name;
    }
}
public class sortcustomobj{
    public static void main(String[] args){
        List<Item> items=new ArrayList<>();
        items.add(new Item(3,"Pen"));
        items.add(new Item(1,"Book"));
        items.add(new Item(2,"Laptop"));
        System.out.println("Before sorting:");
        for(Item i:items) System.out.println(i);
        Collections.sort(items);
        System.out.println("After sorting:");
        for(Item i:items) System.out.println(i);
    }
}

