import java.util.*;

public class PRG4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        String name = in.nextLine();
        
      String[] words = name.split("");
        
      
       for (int i = 0; i < words.length; i++) {
                System.out.print("words[" + i + "]: " + words[i]+ " : " + words[i].length());
            }
        
      
    }
}