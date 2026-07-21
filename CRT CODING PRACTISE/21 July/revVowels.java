import java.io.*;
import java.util.*;
//given string containing vowels reverse only vowels 
public class revVowels {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();
        
        char arr[] = s.toLowerCase().toCharArray();
        
        int left = 0;
        int right = arr.length-1;
        
        while (left < right){
            if(arr[left]!='a' && arr[left]!='e' && arr[left]!='i' && arr[left]!='o' && arr[left]!='u'){
                left++;
            }
            else if(arr[right]!='a' && arr[right]!='e' && arr[right]!='i' && arr[right]!='o' && arr[right]!='u'){
               right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            
        }
        System.out.println(new String(arr));
        }
    }
