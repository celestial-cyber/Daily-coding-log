//
//Given a string S, convert:
//All lowercase letters → uppercase All uppercase letters → lowercase

//Other characters (digits, spaces, symbols) should remain unchanged.

import java.util.*;
class sol3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
      
        String result = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                result += Character.toUpperCase(ch);
            }
            else if(Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            }
            else{
                
                result += ch;
            }
        }
        System.out.println(result);
    }
}
