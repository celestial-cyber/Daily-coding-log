//palindrome program using 2 pointers and recursion 
import java.util.*;

class Palindrome{
    public static void cp(String s, int left, int right){
        if(left>=right){
            System.out.println("Palindrome");
            return;
        }
        if(s.charAt(left)!=s.charAt(right)){
            System.out.println("Not palindrome");
            return;
        }
        cp(s, left+1, right-1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        cp(s,0,s.length()-1);
    }
}