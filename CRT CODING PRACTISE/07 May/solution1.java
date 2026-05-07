//www.hackerrank.com/crt-27-technical-online-sessions-2-1
import java.util.*;

public class solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
   
        int[] array = new int[7];
        int total  =0;
        int average;
        int count = 0;
        
        for(int i =0;i<7;i++){
            array[i] = in.nextInt();
            total += array[i];
        }
        average = total/7;
        
        
        for(int i=0;i<7;i++){
            if(array[i]>average){
                count += 1;
            }
        }
        System.out.print(total + " " + average +" "+ count);
        
        
        
        
        
    }
}