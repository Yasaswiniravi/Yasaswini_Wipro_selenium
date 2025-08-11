package Assignment8;

import java.util.*;
public class palindrome_check{
    public static void main(String[] args){
        String str="madam";
        Deque<Character> dq=new ArrayDeque<>();
        for(char c:str.toCharArray())dq.add(c);
        boolean pal=true;
        while(dq.size()>1){
            if(dq.removeFirst()!=dq.removeLast()){pal=false;break;}
        }
        System.out.println(pal?"Palindrome":"Not Palindrome");
    }
}

