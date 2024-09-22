// 88. Merge Sorted Arrays

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