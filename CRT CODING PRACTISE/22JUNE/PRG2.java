//palindrome creation 
// write a java program t display string charcter in reverse order and length 
import java.util.*;


import java.io.*;
import java.util.*;

// write a java program t display string charcter in reverse order and length 
import java.util.*;


public class PRG2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String rev = "";
        for(int i = name.length()-1;i>=0;i--){
            char ch = name.charAt(i);
           rev = rev+ch;

        }
        System.out.println();

            
          System.out.println(name.length());
          if(name.equals(rev) ){
          System.out.println("palindrome");
                        }
           else{
            System.out.println("Not Palindrome");
           }


        }
        
    }