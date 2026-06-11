//pangram - print the missing character 
import java.util.*;
class solution2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String res =" solution";//26alphabet

        for(int i ='a';i<='z';i++){ // i will satrt with a 
        if(s.indexOf(i)==-1){
            res = res+i; // res = " " +'a' = "a"
        }

        }
        if(res.length()!=26){
        System.out.println(res);
        }
        else{
            System.out.println("No missing characters");
        }

    }
}

