import java.util.*;

class TowerOfHanoi{

    public static void toh(int n,char s, char a, char d){
        if(n==1){
            System.out.println("Move disk 1 from "+s+" to "+d);
            return;
        }
            toh(n-1,s,d,a);
            System.out.println("Move disk "+n+" from "+s+" to "+d);
            toh(n-1,a,s,d);

        }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        toh(n,'s','a','d');
        
    }

}