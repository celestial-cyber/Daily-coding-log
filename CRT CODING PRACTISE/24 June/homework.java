import java.util.*;
//to print the max length substring
class homework {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().toLowerCase();
        int maxlen = 0;
        
        // 1. Add variables to keep track of the best substring's boundaries
        int startIdx = 0;
        int endIdx = 0;

        for (int i = 0; i < s1.length(); i++) {
            LinkedHashSet<Character> ob = new LinkedHashSet<>();
            int curlen = 0;
            for (int j = i; j < s1.length(); j++) {
                char ch = s1.charAt(j);
                if (ob.contains(ch)) {
                    break;
                }
                ob.add(ch);
                curlen++;
            }
            
            if (curlen > maxlen) {
                maxlen = curlen;
                // 2. Update the boundaries whenever a longer unique substring is found
                startIdx = i;
                endIdx = i + curlen; // end index is exclusive in Java's .substring()
            }
        }
        
        // 3. Print both the length and the actual substring
        System.out.println("Max length: " + maxlen);
        System.out.println("Longest substring: " + s1.substring(startIdx, endIdx));
    }
}