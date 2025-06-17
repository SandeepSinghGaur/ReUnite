package striver.src;

import utility.Driver;

/*
Problem code : 73. Set Matrix Zeroes
Problem level : Medium
 */
public class Problem01 {
    /*
   Problem Statement:
   Given an m x n integer matrix, if an element is 0, set its entire row and column to 0.
   Do it in-place, without using extra space proportional to the matrix size.

✅ Constraints:
1 <= m, n <= 200
-2^31 <= matrix[i][j] <= 2^31 - 1

     */
    public static void main(String[] args) {

        Driver driver = new Driver();
        int[][] matrix = driver.twoDArrayInput();
        setZeros(matrix);

    }

    private static void setZeros(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;



    }


}
