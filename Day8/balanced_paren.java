package Assignment8;

import java.util.*;
public class balanced_paren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expr = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        for (char ch : expr.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) isValid = false;
        System.out.println(isValid ? "Valid" : "Invalid");
    }
}
