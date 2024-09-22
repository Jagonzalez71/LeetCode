// 209. Minimum Size Subarray Sum

//Given an array of positive integers nums and a positive integer target,
// return the minimal length of a subarray

 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int start = 0; // the start of the array
        int sum = 0; // the sum of the current subarray
        int minLength = Integer.MAX_VALUE; // we initiate this with a large value in order to store out minimum

        // this loops over the array by using "end" as our end pointer
        for(int end = 0; end < nums.length; end++){
            // adding the current number to the sum
            sum += nums[end];

            // while we look for the condition this will help us advance through the array
            while(sum >= target){
                int currentLength = end - start + 1;

                // updates the minimum length
                if(currentLength < minLength){
                    // if a smaller one is found we replace it
                    minLength = currentLength;
                }
                // we substract the start number in order to move on
                sum -= nums[start];
                // moves to the next number in the array
                start++; 

            }
        }
        // if there is no valid subarray that is found it will simply return 0 or return the minimum length
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
