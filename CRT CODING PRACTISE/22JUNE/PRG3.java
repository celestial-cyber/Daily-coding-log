//input Hello World 
//output 
//w[0]: Hello : 5
//w[1]: World : 5
//world analyser with length 

import java.util.Scanner;

public class PRG3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        if (in.hasNextLine()) {
            String input = in.nextLine();
            
           
            String[] words = input.trim().split("\\s+");
            
            
            for (int i = 0; i < words.length; i++) {
                System.out.println("w[" + i + "]: " + words[i] + " : " + words[i].length());
            }
        }
        
        in.close();
    }
}}