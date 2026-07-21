//withput suing stringbuilder
import java.util.*;

public class charFreq2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String s="";
        
        for(int i=0;i<a;i++){
            s = s+'a';
        }
        for(int i=0;i<b;i++){
            s = s+'b';
        }
        for(int i=0;i<c;i++){
           s = s+'c';
        }
        
        System.out.println(s); 
        
           }
}