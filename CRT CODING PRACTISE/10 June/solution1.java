//baaabacd 
// b  : 2
//a:4
//c:1
//d:1

// most repeated char is a:4 
import java.util.*;
class solution1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        LinkedHashSet<Character> ob = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            ob.add(ch);
        }
        System.out.println(ob);
        //convert collection to character format 
        for(char c:ob){
            //it will copy the ob in c 
            System.out.print(c+" ");
        }


    }
}