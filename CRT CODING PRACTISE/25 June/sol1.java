//chary sir session 
//replace the words at even position but consider the array index is starting from 1 
//length() is a method in string but its a attribute in array so length
import java.util.*;
class sol1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //it will make an array having words 
        String w[] = s.split(" ");

        for(int i=0;i<w.length;i++){
            if((i+1)%2==0){
                
                for (int j = w[i].length()-1; j >= 0; j--) {
                System.out.print(w[i].charAt(j));
                
            }
            
           
            }
            else{
                System.out.print(w[i]);
            }
              System.out.print(" ");
             }
          
     

    }
}