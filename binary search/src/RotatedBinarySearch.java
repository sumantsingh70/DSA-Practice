public class RotatedBinarySearch {
    public static void main(String[] args) {



    }
         int search(int[] nums, int target) {
            int pivot = FindPivot(nums);

            if(pivot==-1){
                //just do normal binary search
                return binarySearch(nums,target,0,nums.length-1);
                
            }

            //if pivot is found then two ascending sorted arrays.
            if(nums[pivot]==target){
                return pivot;
            }
            if(target>=nums[0]){
                return binarySearch(nums,target,0,pivot-1);
            }
           

                return binarySearch(nums,target,pivot+1,nums.length-1); 
              
        
        }

         int binarySearch(int[] arr,int target,int start,int end){
            
    
            while(start<=end){
                
                int mid = start+(end-start)/2;
    
                if(target<arr[mid]){
                    end = mid-1;
                }else if(target>arr[mid]){
                    start = mid +1;
                }else{
                    // ans found
                    return mid;
                }
            }
            return -1;
        }

        static int FindPivotWithDuplicates(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while(start<=end){
                int mid = start + (end-start)/2 ;
                if(mid<end && arr[mid]>arr[mid+1])
                return mid;

                if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;

                //if elements at middle ,start,end are equal then skip the duplicates
                if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                    //skip the duplicates
                    //NOTE: what if these elements at start and end were the pivot??
                    //check if start is pivot
                    if(arr[start]>arr[start+1]){
                        return start;
                    }
                    start++;
                    //check if end is pivot
                    if(arr[end]<arr[end-1]){
                        return end-1;
                    }
                    end--;
                }

                //left side is sorted , so pivot should be on right side.

                else if(arr[start]<arr[mid] || (arr[start]==arr[mid])&&arr[mid]>arr[end]){
                    start=mid+1;
                }
                else{
                    end = mid-1;
                }
                
            }
            return -1; 
        }
        
//this will not work for duplicate values in array
       static int FindPivot(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while(start<=end){
                int mid = start + (end-start)/2 ;
                if(mid<end && arr[mid]>arr[mid+1])
                return mid;

                if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;

                if(arr[start]>=arr[mid])
                end = mid -1;

                else{
                    start = mid +1;
                }
                
            }
            return -1;
        }
    
    
}