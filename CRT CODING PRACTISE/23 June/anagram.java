//session by sarfaraz  sir 
//to check if two given guven straings are anagrams or not for example silent or listen and bad credit and debit card 
// through the words are different but the charcter is different 
import java.util.*;
public class anagram{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = in.nextLine();

        s = s.replaceAll(" ",""); //replace all whitespace 
        s1 = s1.replaceAll(" ","");

        if(s.length()==s1.length()){
            s=s.toLowerCase();
            s1= s1.toLowerCase(); //converting to one case - cause java is case sensitive

            //convert to character array to ease sorting - this provides the indexes to the characters
            char ch[] = s.toCharArray();
            char ch1[] = s1.toCharArray();

            //sort the array
            Arrays.sort(ch);
            Arrays.sort(ch1);

            if(Arrays.equals(ch,ch1)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");

            }
            }
        else{
            System.out.println("Not Anagrams");
        }
}

}