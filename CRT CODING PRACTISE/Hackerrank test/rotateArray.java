//right rotatin = (i+k)%n
//where i = old index , k = right irotations , n = array length
//left rotation = (i-k+n)%n or (i+(n-k))%n

import java.util.*;

public class rotateArray{
    public static void main(String args[]){
        int [] arr ={1,2,3,4,5,6};
        int k =2;
        int[] rotated = rotateRight(arr,k);
        System.out.println(Arrays.toString(rotated));
            


    }
    public static int[] rotateRight(int[] , int k){
        int n= arr.length;
        k%=n;
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            result[(i+k)%n]==arr[i];
        }
        return result;
    }
}
    
