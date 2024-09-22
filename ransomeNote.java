// 383. Ransome Note

// Given two strings ransomNote and magazine, return true if ransomNote 
// can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // creating an array the size of 26 to store the count of each letter
        int[] letters = new int[26];

        // for loop to go through the magazine
        for(int i = 0;i < magazine.length(); i++){
            // get the current character at index i        
            char character1 = magazine.charAt(i);
            // increments the count of that character
            letters[character1 - 'a']++;
        }

        // for loop to go through the ransomNote
        for(int i = 0; i <ransomNote.length(); i++){
            // gets the current character at index 1
            char character2 = ransomNote.charAt(i);
            // decrements the count of that character
            letters[character2 - 'a']--;

            // if the count goes below 0 there is not enough characters so it returns false
            if(letters[character2 - 'a'] == -1){
                return false;
            }
        }
        // if all the notes in the ransomNote are in the magazine it returns true
        return true;
    }
}
