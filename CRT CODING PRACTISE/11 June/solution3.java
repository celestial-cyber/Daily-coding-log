//pangram - print the missing character 
import java.util.*;
class solution3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int c =0;
        for(char i='a' ;i<='z';i++){
            String ch =i+"";  // ch ='a' +";="a" e=getc converted to string by adding space 
            if(s.contains(ch))
            c++;
        }
        if(c==26)
        System.out.println("Pangram");
        else
        System.out.println("Not Pangram");
        
    }
}