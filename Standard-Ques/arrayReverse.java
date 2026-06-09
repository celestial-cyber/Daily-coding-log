class arrayReverse{
    public static void main(String[] args){
        int arr[] = {01,20,30,40,50};
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
        for(int num:arr){
            System.out.println(num);
        }

    }
}
//space complexity = O[1] and time complexity =O[1]