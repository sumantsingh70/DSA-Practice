public class RotationCount {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));  
    }

    
    private static int countRotations(int[] arr){
        int pivot = FindPivot(arr); 
        return pivot +1; 
    }


    //for non-duplicates
    static int FindPivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
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

    //for duplicates
    static int FindPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2 ;

            if(mid<end && arr[mid]>arr[mid+1])
            return mid;

            if(mid>start && arr[mid]<arr[mid-1])
            return mid-1;

            //if elements at middle , start, and end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){

                //NOTE:what if these elements at start and end are pivots??

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
            //left side is sorted so pivot should be right.

            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[end]<arr[mid]) ){
                 start = mid +1;
            }
            else{
                end = mid -1;
            }
            
        }
        return -1;  
    }


}
