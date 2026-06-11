import java.util.*;
class solution2{
public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    String s = in.nextLine();
    int maxfreq= 0;
    char maxchar =' ';

    int a[] = new int[256];//a[0]=0. a[1] =0;......................a[256]=0;
    for(int i =0;i<s.length();i++){
        char ch = s.charAt(i);

        a[ch]++;//a[97]= 1 , a[98]= a[98]=1;  // A= 1 , B = 2, C=1, D=1
        //ASCII -> SPECIAL -- digits-- upper -- lower case 
        // print b =2, a=4 , c=1 d=1 // insertion order as well as in dictionary order(lexicography) - a= 4, b=-2 c=1 d=4 
        
        }
        for(int i=0;i<256;i++){
            //i=0,1,2,3,--------------a[97]=4
            if(a[i]>0){ //print only non zero elements
                System.out.println((char)i+" : "+a[i]);// a:4 b:2 c:1 d:1
            }
            if(a[i]>maxfreq){
                maxfreq= a[i];
                maxchar=(char)i;
            }
        }
        System.out.println("Most Repeated char is :"+ maxchar + " count is " + maxfreq);
    }
}
