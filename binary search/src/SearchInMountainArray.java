

public class SearchInMountainArray {
    public static void main(String[] args) {
        
    }

    
    int search(int[] arr,int target){
        int peak = PeakIndexMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr, 0, peak, target);
        if(firstTry!=-1){
            return firstTry;
        }
        return OrderAgnosticBS(arr, peak+1, arr.length-1, target);
        
    }

    public int PeakIndexMountainArray(int[] arr,){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    static int OrderAgnosticBS(int[] arr,int start,int end,int target){
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            } 
            if(isAsc){
                if(arr[mid]>target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    
}
