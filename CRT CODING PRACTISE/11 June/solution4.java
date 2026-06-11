// weneed to sort our string according frequnecy count in ascending order 
// as well as in lexographically 
//prioity - 1 occurences , 2 frquency , ascending order 
// String s ="Za1aBbc2A" ; len = 9 1 frequency count = Z1Bbc2A [12ABZbcaa] 2-a
import java.util.*;
class solution4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a[] = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            a[ch]++; // to findd the count of individual character a[65] =1 //count of A 
        }

        for(int i=1;i<s.length();i++){ // i=1 to i<=7
        for(int j=0 ;j<256;j++){ 
            if(a[j]==i){ //a[j] =a[65] , 1==1 cause a[65]=1
            while(a[j]-->0){
                System.out.print((char)j);
            }

            }

        }
        

        }
    }

}