//printing missing chcaracter lin given two anagram string or else print no missing character 
//silent and lisen
//in string we have length() function while inarray we will have length attribute 
//session by sarfaraz sir 
import java.util.*;
class sol1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine().toLowerCase();
        String s2 = in.nextLine().toLowerCase(); //take ascii array size as 26 cause we r taking lowercase
        //to take the count of s1 and s2 
        int a[] = new int[26];
        int b[] = new int[26];
        int found= 0;

        //it will store the frequency of character in the first string
        for(int i=0;i<s1.length();i++){
            char ch =s1.charAt(i);
            a[ch-'a']++;
        }
        //a[115-97] = a[18] means at a[18] we willl hv 1 

        //it will store the frequency of character in the second string
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            b[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                System.out.println((char)(i+'a'));
                found =1;

                //it will print i+'a' so if i = 13 and a=97 so i+"a" becomes 110 means n 
                }

        }
        if(found == 0){
            System.out.println("No missing character");
        }



        
        
    }
}