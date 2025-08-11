package assignment9;

import java.util.*;
class Book implements Comparable<Book>{
    int bookId;
    String title;
    Book(int bookId,String title){
        this.bookId=bookId;
        this.title=title;
    }
    public int compareTo(Book b){
        return b.bookId - this.bookId;
    }
    public String toString(){
        return bookId+" "+title;
    }
}
public class sortbooks{
    public static void main(String[] args){
        List<Book> books=new ArrayList<>();
        books.add(new Book(3,"Java"));
        books.add(new Book(1,"Python"));
        books.add(new Book(2,"C++"));
        Collections.sort(books);
        for(Book b:books)
            System.out.println(b);
    }
}

