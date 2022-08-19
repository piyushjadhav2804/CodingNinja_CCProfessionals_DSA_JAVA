
public class Solution {

	public static int firstIndex(int arr[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
        if(arr.length == 0)
            return -1;

        if(arr[0] == x)
            return 0;

        int smallArray[] = new int[arr.length-1];
        for(int i=1; i<arr.length; i++) 
            smallArray[i-1] = arr[i];
        
        int ans = firstIndex(smallArray, x);
        
        if(ans == -1)
            return -1;
        
        else 
            return ans + 1;
	}
	
}
