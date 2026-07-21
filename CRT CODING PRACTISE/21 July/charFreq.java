//given three charcters a,b,c construct a string such that character a appears a times , character b appear b time and so
//the characters must be appeared in the alphaebtical order 
//string, string buffer , string bulder , string tokenizer - 
//once a string is created it cant e modified - if we try to modify it it will create a new object 

import java.io.*;
import java.util.*;

public class charFreq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<a;i++){
            str.append('a');
        }
        for(int i=0;i<b;i++){
            str.append('b');
        }
        for(int i=0;i<c;i++){
            str.append('c');
        }
        
        System.out.println(str.toString()); 
        
           }
}