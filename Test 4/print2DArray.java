public class solution {
	
    public static void printRows(int input[][], int n, int row) {
        
        for(int i=0; i<n; i++) {
            
            for(int j=0; j<input[row].length; j++)
            	System.out.print(input[row][j] + " ");
            
            System.out.println();
        }
        
        
    }
    
    public static void print2DArray(int input[][]) {
		// Write your code here
        
        int temp = input.length;
        
		for(int i=0; i<input.length; i++) {
            
            printRows(input, temp, i);
            
            temp--;
        }
	}
}
