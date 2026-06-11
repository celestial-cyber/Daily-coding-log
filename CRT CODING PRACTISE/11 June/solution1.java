//pangram 
import java.util.*;
class solution1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String res ="";//26alphabet

        for(int i ='a';i<='z';i++){ // i will satrt with a 
        if(s.indexOf(i)!=-1){
            res = res+i; // res = " " +'a' = "a"
        }

        }
        if(res.length()==26)
        System.out.println("Pangram");
        else{
            System.out.println("Not Pangram");
        }

    }
}