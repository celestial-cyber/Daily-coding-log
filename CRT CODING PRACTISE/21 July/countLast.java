//given a group of words - find the length of last word 
import java.io.*;
import java.util.*;

public class countLast{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
    int length=0;
    int i = s.length()-1;
    
    while(i>=0 && s.charAt(i)==' '){
        i--;
    }
    
    while(i>=0 && s.charAt(i)!=' '){
        length++;
        i--;
    }
    System.out.println(length);
    
    
    
    
    }
}