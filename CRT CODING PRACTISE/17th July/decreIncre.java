//If input is 5 we need to print 5 4 3 2 1 1 2 3 4 5 without loops and switch statement 
import java.util.*;
class decreIncre{
    //no need to creat objects
    //method 1 - static method
    static void decrincr(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        decrincr(n-1);
        System.out.print(n+" "); // this will be executed when n =0 satisfies and it will print  1 2 3 4 5 - as it will
        //return to the previous values (backtracking)

        //void di(int n)   5   4  3  2   1   0
        //if(n==2)         f   f  f  f   f   t
        //return           ne ne  ne ne ne  ex
        //sop(n+)          5    4    3   2   1  
        //din(n-1)         di(4) di(3) di(2) di(1) di(0)
        //sop(n+)          pen    pen   pen   pen  pen
        //                  1     2     3     4    5
        }
    //main method or driver method
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        decrincr(n); //function with int args but wihtout return type
    }
}