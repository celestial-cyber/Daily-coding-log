//Reverse only those words whose starting character is a consonant Keep words starting with vowels unchanged

import java.util.*;
class sol2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //it will make an array having words 
        String w[] = s.split(" ");

        for(int i=0;i<w.length;i++){
            char first = Character.toLowerCase(w[i].charAt(0));
            if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
                // Vowel - print as is
                System.out.print(w[i]);
            }
            else{
                // Consonant - reverse the word
                for (int j = w[i].length()-1; j >= 0; j--) {
                    System.out.print(w[i].charAt(j));
                }
            }
            System.out.print(" ");
        }
          
     

    }
}
