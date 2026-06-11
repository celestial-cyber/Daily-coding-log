//solution4 in descedning order -
import java.util.*;
class solution7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a[] = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            a[ch]++;
        }

        int f=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(a[ch]==1){
                System.out.println("First Repeating char is : "+ch);
                f=1;
                break;//we are using break here so that if in case there two character having 1 as frequency - we will only print the first character not all 
            }
        }
        if(f==0)
        System.out.println("All are duplicates");

            }
           
        }
        

       