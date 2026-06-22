//reverse words by words 
import java.util.*;
public class prg7{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        String sentence = in.nextLine();
        String[] words = sentence.split(" ");
        for(int i =0;i<words.length;i++){
            for(int j=words[i].length()-1;j>=0;j--){
                char ch = words[i].charAt(j);
             System.out.print(ch);

            }
            System.out.print(" ");
           
        

        }
    }
}