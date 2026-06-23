// to find all the anagrams strings in the sentence 
//hai iam mia from aih going to romf 
//w0  w1  w2  w3   w4   w5   w6  w7 //string w[] = s.split(" ") - it converst the sstring into string array
import java.util.*;
class anagram2{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);

        String s = in.nextLine();
        String w[] = s.split(" ");
        //to check one word to other word
        int flag = 0; //bydefault no anagrams

        for(int i=0;i<w.length;i++){
            for(int j=i+1;j<w.length;j++){
                String s1 = w[i]; //stores w[i] in s1 
                String s2 =w[j];//stores w[j] in s2

                if(s1.length()==s2.length()){
                    char ch1[] = s1.toLowerCase().toCharArray();
                    char ch2[] = s2.toLowerCase().toCharArray();

                    Arrays.sort(ch1);
                    Arrays.sort(ch2);

                    if(Arrays.equals(ch1,ch2)){
                        System.out.println(s1+":"+s2);
                        flag++;
                    }
                } 

            }
        }
        //if flag!=0 then this condiiton will be false and it will not print that no anagrams are found
        if(flag==0){
            System.out.println("no anagrams found");
        }
    }
}
