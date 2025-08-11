package assignment9;
import java.util.*;
class Product{
    String name;
    double price;
    Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public String toString(){
        return name+" "+price;
    }
}
class PriceAscComparator implements Comparator<Product>{
    public int compare(Product p1,Product p2){
        return Double.compare(p1.price,p2.price);
    }
}
class PriceDescComparator implements Comparator<Product>{
    public int compare(Product p1,Product p2){
        return Double.compare(p2.price,p1.price);
    }
}
class NameComparator implements Comparator<Product>{
    public int compare(Product p1,Product p2){
        return p1.name.compareTo(p2.name);
    }
}
public class prodsortdemo{
    public static void main(String[] args){
        List<Product> products=new ArrayList<>();
        products.add(new Product("Pen",10.5));
        products.add(new Product("Book",55.0));
        products.add(new Product("Laptop",35000.0));
        Collections.sort(products,new PriceAscComparator());
        System.out.println("Price Ascending:");
        products.forEach(System.out::println);
        Collections.sort(products,new PriceDescComparator());
        System.out.println("Price Descending:");
        products.forEach(System.out::println);
        Collections.sort(products,new NameComparator());
        System.out.println("Name Alphabetical:");
        products.forEach(System.out::println);
    }
}

