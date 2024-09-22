// 125. Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        // if the string is empty return true since the string is a palindrome
        if(s.isEmpty()){
            return true;
        }

        // our variable that will keep track of the start and ending of the string
        int start = 0;
        int end = s.length() - 1;

        // will run until start has reached the position of end
        while(start <= end){

            // we will use these variables to compare them at eachother to find if its a palindrome or not
            char left = s.charAt(start);
            char right = s.charAt(end);

            // skips any non-alphanumeric characters in the given string from the start
            if(!Character.isLetterOrDigit(left)){
                start++;
            // skips any non-alphanumeric characters in the given string from the enn
            } else if(!Character.isLetterOrDigit(right)){
                end--;

            } else {
                // this is going to convert any uppercase letter to a lower case and compare it with the other current
                // character to check if it's the same
                if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                    // if it's not then it is not a palindrome so it returns false
                    return false;
                }
                // we update our variables to move onto the next characters
                start++;
                end--;
            }
        }
        return true;
    }
}