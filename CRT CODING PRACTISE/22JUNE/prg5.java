// finding max word in a strng 
import java.util.*;
public class prg5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String maxword =" ";
        String[] word = s.split(" ");
        for(String w :word){
            if (w.length()>maxword.length())
            {
                maxword = w;
            }
        }
        System.out.print(maxword);
        
    }

    }

