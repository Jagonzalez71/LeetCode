// 35. Valid Sudoku

// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:

// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.

import java.util.HashMap;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // creating a Hash Map in order to keep track of the numbers in each row and column, and the 3x3 subgrid
        HashMap<Character, Integer> map2 = new HashMap<>();

        // checks each row in the soduko table
        for(int i = 0; i <board.length; i++){
            for(int j = 0; j <board[i].length; j++){

                // checks if ther current spot has a number, if not it will be skipped
                if(board[i][j] == '.') continue;
                // if the current spot is a number that is already in the map it will return false
                if(map2.containsKey(board[i][j])) return false;

                // if it's a new number it will be added to the map
                map2.put(board[i][j],1);
            }
            // clears the map for the next iteration
            map2.clear();
        }

        // checks each column in the soduko table
        for(int j=0; j<board.length; j++){
            for(int i=0; i<board.length; i++){

                // will check if there is a number in the spot, if not it will be skipped
                if(board[i][j]=='.') continue;
                // compares this number to the others in the map to verify if its a duplicate or not
                // if it is then it returns false
                if(map2.containsKey(board[i][j])) return false;

                // if it's a new number then it will add it to the map
                map2.put(board[i][j], 1);
            }
            // clears the map for next iteration
            map2.clear();
        }

        // these variables will help with the 3x3 subgrids
        int i=0; //row
        int m=0; // column

        // will traverse all the 3x3 subgrids in the sudoku board
        while(i<board.length && m<board[0].length){

            // this will traverse through the current subgrid
            for(int k=i; k<i+3; k++){
                for(int j=m; j<m+3; j++){

                    // like before, skips any empty positions
                    if(board[k][j]=='.') continue;
                    // if a duplicate is found it will return false
                    if(map2.containsKey(board[k][j])) return false;

                    // if not, number will be added to the map
                    map2.put(board[k][j], 1);
                }
            }
            // this helps move to the next subgrid
            i = i+3;
            // if the row is done, we move onto the next column
            if(i>=board.length) {m=m+3; i=0;}
            // clears the map for the next iteration
            map2.clear();
        }
        // lastly, if no duplicate was found, it will return true(valid)
        return true;
    }
}
