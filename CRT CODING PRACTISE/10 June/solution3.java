import java.util.*;
class solution3{
    public static void main(String args[]){
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
        boolean print[] = new boolean[256]; // p[0]= f , p[97]=f bydefault value 
        //baaabacd
        //01234567
        //i=0 p[98] = f print b=2 p[98]=t
        //i=1 p[97] = f print a=4 p[97] =t
        //i=2 p[97] = t skip print a 
        //i=3 p[97] = t skip
        //i=4 p[98] = t skip 
        //i=5 p[97] = t skip 
        //i=6 [99]
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!print[ch]){
                System.out.print(ch+" : "+ a[ch]);//b : 2
                print[ch]= true;//p[98] = true
            }
            if(a[i]>maxfreq){
                maxfreq= a[i];
                maxchar=(char)i;
            }
        } 
        System.out.println("Most Repeated char is :"+ maxchar + " count is " + maxfreq);

    }
    
}

//find the secnd most repeated character 
