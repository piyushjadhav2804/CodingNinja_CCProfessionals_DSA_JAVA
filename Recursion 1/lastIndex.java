
public class Solution {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        if(input.length == 0)
            return -1;
        
        
        int temp[] = new int[input.length-1];
        for(int i=1; i<input.length; i++)
            temp[i-1]= input[i];
        
        int ans = lastIndex(temp,x);
        
        if(ans != -1)
            return ans + 1;
        
        
        else {
            
            if(input[0] == x)
                return 0;
            else 
                return -1;
        }
	}
	
}
