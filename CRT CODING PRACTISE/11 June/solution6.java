//solution4 in descedning order -
import java.util.*;
class solution6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a[] = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            a[ch]++;
        }

        for(int i=0;i<s.length();i++){ 
        for(int j=0 ;j<256;j++){ 
            if(a[j]==1){ 
            while(a[j]-->0){
                
                System.out.print((char)j);
               
               
            }
             break;

            }
           
        }
        

        }
    }

}