// 88. Merge Sorted Arrays
// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
// To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
// and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       // first we have to initialize our variables
       int j = m - 1; // nums1
       int i = n - 1; // num2
       int k = m + n -1; // last point in nums1

       // while there is still elements in num2 we will go inside the while loop
       while(i>=0){
        // compares the numbers in nums1 and nums2
        if(j>=0 && nums1[j]>nums2[i]){
            // places the larger number from nums1 into the end of nums1
            nums1[k] = nums1[j];
            // moves the pointer to the left
            j--;
        } else {
            // places the larger number from nums2 into the end of nums1
            nums1[k] = nums2[i];
            // moves the pointer to the left
            i--;
        }
        // moves the pointer to the left
        k--;
       }
    }
}
