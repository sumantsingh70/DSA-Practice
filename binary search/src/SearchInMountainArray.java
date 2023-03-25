

public class SearchInMountainArray {
    public static void main(String[] args) {
        
    }

    int search(int[] arr,int target){
        int peak= PeakIndexMountainArray(arr) ;
        int firstTry=OrderAgnosticBS(arr,target, 0 ,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return OrderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    

    public int PeakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){ 
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    static int OrderAgnosticBS(int[] arr , int target,int  start , int end  ){
        //find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            //find the middle element
//            int mid = (start+end)/2;   //might be possible that (start+end) exceeds the range of integer in java
            int mid = start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }


        }
        return -1;
    }
    
}
