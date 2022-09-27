// Write a code to perform different operations on matrix.
// 1. Addition
//  You are given two matrices return the addition of these two matrices.
// 2. Multiplication
// Given two matrices return the matrix multiplication of them.(Both the matrices will always be multiplicable).
// 3. Transpose
// Given a Matrix calculate the transpose of the matrix and return it. (Number of rows and columns will be same)
// 4. Rotate by 90
// Given a Matrix, rotate the matrix by 90 degree in anticlockwise direction.
// Input format :
// Line 1: Operation to be performed
// Line 2 : No of rows(n1) & No of columns(m1) (separated by space)
// Line 3 : Row 1 elements (separated by space)
// Line 4 : Row 2 elements (separated by space)
// Line 5 : and so on
// (If needed)
// Line n1+2 : No of rows(n2) & No of columns(m2)(separated by space)
// Line n1+3 : Row 1 elements (separated by space)
// Line n1+4 : Row 2 elements (separated by space)
// Line n1+5 : and so on
// Sample Input 1 :
// 1
// 2 2
// 1 2
// 1 3
// 2 2
// 4 3
// 1 5
// Sample output 1 :
// 5 5
// 2 8


public class mat{
	int [][] matrix;
	
	mat(int [][] mat)
	{
		matrix=mat;
	}
		
	
	    public static mat add(mat a,mat b)
	    {
            
            if(a.matrix.length != b.matrix.length)
                return null;
	      
            int n = a.matrix.length;
            int m = a.matrix[0].length;
            
			int c[][] = new int[n][m];
 
            for (int i = 0; i < n; i++) {
            
                for (int j = 0; j < m; j++)
                
                    c[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
            
            mat res = new mat(c);
            
            return res;
        }
	    	

	    public static mat multiply(mat a,mat b)
	    {
            int n = a.matrix.length;
            int m = a.matrix[0].length;
                    
            int c[][] = new int[n][m];
            
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    c[i][j] = 0;
                    
                    for (int k = 0; k < n; k++)
                        c[i][j] += a.matrix[i][k] * b.matrix[k][j];
                }
            }
            
            mat res = new mat(c);
            
            return res;
	       
	    }
	    public static mat transpose(mat m)
	    {
            
            int n = m.matrix.length;
            int p = m.matrix[0].length;
            
            int c[][] = new int[n][p];
            
            for(int i=0;i<n;i++) {
                
                for(int j=0;j<p;j++){    

                    c[i][j]=m.matrix[j][i];  
                }    
            }  
	    	
            mat res = new mat(c);
            
            return res;
	    }
	    public static mat rotate(mat m)
	    {
            
            int N = m.matrix.length;
            
	    	for (int x = 0; x < N/2; x++) {

                for (int y = x; y < N - x - 1; y++) {
                
                    int temp = m.matrix[x][y];
 
					m.matrix[x][y] = m.matrix[y][N - 1 - x];
 
	                m.matrix[y][N - 1 - x]= m.matrix[N - 1 - x][N - 1 - y];

                    m.matrix[N - 1 - x][N - 1 - y]= m.matrix[N - 1 - y][x];
 
                    m.matrix[N - 1 - y][x] = temp;
            }
        }
 
            return m;
	    }
    
	    public  void print()
	    {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	 }
