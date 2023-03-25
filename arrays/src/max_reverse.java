import java.util.Arrays;

public class max_reverse {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,34,98,105};
        System.out.println(maxa(arr));
        System.out.println(maxRange(arr,2,5));

        reverse(arr);
        System.out.println(Arrays.toString(arr));



    }

     static int maxa(int[] arr) {
        int maxVAl = arr[0];
        for (int i=1; i<arr.length;i++)
        {
            if (arr[i]>maxVAl){
                maxVAl=arr[i];
            }
        }

        return maxVAl;

    }

    static int maxRange(int[] arr , int start,int end){
        int maxVal=arr[start];
        for (int i=start;i<end;i++){
            if (arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }


}
