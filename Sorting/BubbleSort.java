import java.util.Arrays;

public class BubbleSort{
    
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times.
        for(int i=0;i<=arr.length-1;i++){
            swapped = false;
            //for each step ,max element will come at the last respective index.
            for(int j=1;j<=arr.length-i-1;j++){
                //swap if the item is smaller than the previous item.
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                    swapped= true;
                } 
                
            }
            //if you did not swap for a particular value of i,it means the array is sorted hence stop the program. 
            if(!swapped){    // swapped == flase    !false == true
                break;
            }
        }
    }
}