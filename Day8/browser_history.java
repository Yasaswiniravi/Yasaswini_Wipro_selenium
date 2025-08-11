package Assignment8;

import java.util.*;
public class browser_history{
    public static void main(String[] args){
        Deque<String> back=new ArrayDeque<>();
        Deque<String> forward=new ArrayDeque<>();
        String current="Home";
        back.push(current);
        current="Page1";back.push(current);
        current="Page2";back.push(current);
        forward.push(back.pop());
        current=back.peek();
        System.out.println("Back to:"+current);
        back.push(forward.pop());
        System.out.println("Forward to:"+back.peek());
    }
}
