package assignment9;
import java.util.*;
class Book1 implements Comparable<Book1>{
    int id;
    String title, author;
    Book1(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
    }
    public int compareTo(Book1 b){
        return this.id - b.id;
    }
    public String toString(){
        return id+" "+title+" "+author;
    }
}
class TitleAuthorComparator implements Comparator<Book1>{
    public int compare(Book1 b1, Book1 b2){
        int res = b1.title.compareTo(b2.title);
        if(res == 0)
            return b1.author.compareTo(b2.author);
        else
            return res;
    }
}
public class booksortd{
    public static void main(String[] args){
        List<Book1> books = new ArrayList<>();
        books.add(new Book1(3,"Java","Alice"));
        books.add(new Book1(1,"Python","Bob"));
        books.add(new Book1(2,"Java","Charlie"));
        System.out.println("Sort by ID (Comparable):");
        Collections.sort(books);
        for(Book1 b : books)
            System.out.println(b);
        System.out.println("Sort by Title then Author (Comparator):");
        Collections.sort(books, new TitleAuthorComparator());
        for(Book1 b : books)
            System.out.println(b);
    }
}
