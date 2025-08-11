package Assignment8;

import java.util.Stack;
public class stackemp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack after pushes: " + stack);
        stack.pop();
        System.out.println("After pop: " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

