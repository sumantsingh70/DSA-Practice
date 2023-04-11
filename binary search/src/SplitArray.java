public class SplitArray {
    public static void main(String[] args) {
        
    }

    public int splitArray(int[] nums, int k) {
        int start =0;
        int end =0;
        for(int i=0; i<nums.length;i++){
            start =Math.max(start,nums[i]); //this will return the maximum element in the array which will be the minimum possible answer.
            end +=nums[i]; //this will return the sum of all elements in the array which will be the maximum possible answer. 
        }
        // now we apply binary search as maximum and minimum possible value for answer is found i.e the required answer is found in between this only.

        while(start<end){
             //try for the middle as potential answer.

             int mid = start + (end-start)/2;

             //calculate how many pieces you can divide this with max sum.

             int sum =0;
             int pieces = 1;
             for(int num ; num<nums ;){
                if(sum +num)
             }
        }

        return start;  //here start == end
    }
}
  
