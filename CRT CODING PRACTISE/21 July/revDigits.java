//given a string + num charcter char56r812y - just revrese the place of digit leaving other charcters as it is 
//example char56r812y -> output will be char21r865y


import java.util.*;

class revDigits{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        
        String s = sc.next();
        char[] arr = s.toCharArray();
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            
            if (!Character.isDigit(arr[left])) {
                left++;
            } 
           
            else if (!Character.isDigit(arr[right])) {
                right--;
            } 
           
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }
        
        System.out.println(new String(arr));
    }
}