package assignment9;

import java.util.*;
class Product implements Comparable<Product>{
    String name;
    double price;
    Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public int compareTo(Product p){
        return Double.compare(this.price,p.price);
    }
    public String toString(){
        return name+" "+price;
    }
}
public class sortproducts{
    public static void main(String[] args){
        List<Product> products=new ArrayList<>();
        products.add(new Product("Pen",10.5));
        products.add(new Product("Book",55.0));
        products.add(new Product("Laptop",35000.0));
        Collections.sort(products);
        for(Product p:products)
            System.out.println(p);
    }
}

