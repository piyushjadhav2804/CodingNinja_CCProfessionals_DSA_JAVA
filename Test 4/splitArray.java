
public class solution {

    public static boolean split(int[] arr, int n, int start, int lsum, int rsum) {

        if (start == n)
            return lsum == rsum;
        
        if (arr[start] % 5 == 0)
            lsum += arr[start];
		
        else if (arr[start] % 3 == 0)
            rsum += arr[start];
        
        else return split(arr, n, start + 1, lsum + arr[start], rsum) || split(arr, n, start + 1, lsum, rsum + arr[start]);

        return split(arr, n, start + 1, lsum, rsum);
    }
    
	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
	
         return split(input, input.length, 0, 0, 0);
	}
	

}
