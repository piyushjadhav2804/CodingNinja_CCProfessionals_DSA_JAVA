// You are given N, and for a given N x N chessboard, find a way to place N queens such that no queen can attack any other queen on the chess board. A queen can be killed when it lies in the same row, or same column, or the same diagonal of any of the other queens. You have to print all such configurations.
// Input Format :
// Line 1 : Integer N
// Output Format :
// One Line for every board configuration. 
// Every line will have N*N board elements printed row wise and are separated by space
// Note : Don't print anything if there isn't any valid configuration.
// Constraints :
// 1<=N<=10
// Sample Input 1:
// 4
// Sample Output 1 :
// 0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 0 
// 0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0 


public class Solution {
	

    static boolean isSafe(int board[][], int row, int col, int N) {

        int i, j; 

        for (i=0; i<row; i++) {

            if (board[i][col]==1)
                return false;
        }

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 1) 
                return false;
        }

        for (i=row,j=col;i>=0 && j<N;i--,j++) {

            if (board[i][j] == 1) 
                return false;
        }

        return true; 
    } 

    static void printSolution(int board[][], int N) {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) 
                System.out.print(board[i][j]+" ");  
        } 

        System.out.println(); 
    } 

	static void solveNQueens(int board[][], int row, int N) {
        
        
        if (row == N) {
            
            printSolution(board,N); 
            return;
        } 

        for (int i = 0; i < N; i++) {
            
            if ( isSafe(board, row, i, N) ) {
                
                board[row][i] = 1; 

                solveNQueens(board, row + 1, N); 

                board[row][i] = 0; 
            } 
        } 
	}

    public static void placeNQueens(int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Print output as specified in the question
         */

        int[][] board = new int[n][n];
        solveNQueens(board, 0,n);

	}
	
}
