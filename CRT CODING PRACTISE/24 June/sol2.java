// we eneed to find max unique count of all substring in a given string 
// eg : abcadeacb 5
//eg abcdacdefabc : 5

import java.util.*;
class sol2{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        String s1 = sc.nextLine().toLowerCase();
        int maxlen=0;
        for(int i=0;i<s1.length();i++){
            LinkedHashSet<Character> ob = new LinkedHashSet<>();
            int curlen=0;
            for(int j =i;j<s1.length();j++){
                char ch = s1.charAt(j);
                if(ob.contains(ch)){
                    break;

                }
                ob.add(ch);
                curlen ++;
                
            }
            if(curlen>maxlen){
                maxlen=curlen;
               

            }
        }
        System.out.println(maxlen);
            


            }
        }
    
