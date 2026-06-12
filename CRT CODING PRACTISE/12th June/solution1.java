// print reverse of each word
// cse it eee branch -> esc ti eee branch




import java.util.*;

class solution1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String w[] = s.split(" ");
        
        for (int i = 0; i < w.length; i++) {
            String word = w[i];
            
            for (int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }
            
            System.out.print(" ");
        }
    }
}