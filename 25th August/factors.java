import java.util.*;
class factors {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }

        }
        
       
        System.out.println(count);
        
        
    }

}